//https://leetcode.com/problems/next-greater-element-ii/description/

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            int currEl = arr[idx];

            while(!s.isEmpty() && s.peek() <= currEl) {
                s.pop();
            }

            if(i < n) {
                if(s.isEmpty()) {
                    ans[i] = -1;
                }
                else {
                    ans[i] = s.peek();
                }
            }

            s.push(currEl);
        }

        return ans;
    }
}
