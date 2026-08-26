//https://leetcode.com/problems/sliding-window-maximum/description/

class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;

        int[] ans = new int[n - k + 1];
        int ansIndex = 0;

        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            if(!dq.isEmpty() && dq.getFirst() <= (i - k)) {
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.removeLast();
            }

            dq.addLast(i);

            if(i >= (k - 1)) {
                ans[ansIndex++] = arr[dq.getFirst()];
            }
        }

        return ans;
    }
}
