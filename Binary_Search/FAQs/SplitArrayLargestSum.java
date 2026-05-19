//https://leetcode.com/problems/split-array-largest-sum/description/

class Solution {
    public int numberSubArray(int[] a, int sum) {
        int subArrayCount = 0;
        int currSum = 0;
        for(int i = 0; i < a.length; i++) {
            if(currSum + a[i] > sum) {
                currSum = a[i];
                subArrayCount++;
            }
            else {
                currSum += a[i];
            }
        }
        return subArrayCount + 1;
    }
    public int largestSubarraySumMinimized(int[] a, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int i = 0; i < a.length; i++) {
            low = Math.max(low, a[i]);
            high += a[i];
        }

        while(low <= high) {
            int mid = (low + high) / 2;
            int subArrayCount = numberSubArray(a, mid);
            if(subArrayCount <= k) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
