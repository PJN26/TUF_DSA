// https://leetcode.com/problems/rearrange-array-elements-by-sign/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int positiveIdx = 0;
        int negativeIdx = 1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans[positiveIdx] = nums[i];
                positiveIdx += 2;
            }
            else {
                ans[negativeIdx] = nums[i];
                negativeIdx += 2;
            }
        }
        return ans;
    }
}