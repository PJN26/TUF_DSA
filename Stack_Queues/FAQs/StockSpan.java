class Solution {
    public int[] stockSpan(int[] arr, int n) {
        int[] ans = new int[n];

        int[] pge = new int[n];

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) pge[i] = -1;
            else pge[i] = s.peek();

            s.push(i);
        }

        for(int i = 0; i < n; i++) {
            ans[i] = i - pge[i];
        }

        return ans;
    }
}

