//https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        int sumofN = (nums.length) * (nums.length + 1) / 2;

        for(int i = 0; i < nums.length; i++) {
            arraySum += nums[i];
        }

        return sumofN - arraySum;
    }
}