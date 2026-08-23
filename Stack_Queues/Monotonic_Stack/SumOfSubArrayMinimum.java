//https://leetcode.com/problems/sum-of-subarray-minimums/description/

class Solution {

    public int[] findNSE(int[] arr) {
        int n = arr.length;

        int[] ans = new int[n];

        Stack<Integer> s = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            ans[i] = !s.isEmpty() ? s.peek() : n;

            s.push(i);
        }

        return ans;
    }

    public int[] findPSEE(int[] arr) {
        int n = arr.length;

        int[] ans = new int[n];

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && arr[s.peek()] > arr[i]) {
                s.pop();
            }

            ans[i] = !s.isEmpty() ? s.peek() : -1;

            s.push(i);
        }

        return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);

        int n = arr.length;

        int mod = (int)1e9 + 7;

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;

            long freq = left * right * 1L;

            int val = (int)((freq * arr[i]) % mod);

            sum = (sum + val) % mod;
        }
        return sum;
    }
}
