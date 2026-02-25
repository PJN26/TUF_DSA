//https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majorityEl = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == majorityEl) {
                count++;
            }
            else {
                count--;
            }

            if(count == 0) {
                count = 1;
                majorityEl = nums[i];
            }
        }

        return majorityEl;
    }
}