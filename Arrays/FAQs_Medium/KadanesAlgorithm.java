//https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        int largestSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(currSum > largestSum) {
                largestSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return largestSum;
    }
}