//https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                int currConsecutive = 0;
                while(i < nums.length && nums[i] == 1) {
                    currConsecutive++;
                    i++;
                }
                maxConsecutiveOnes = Math.max(currConsecutive, maxConsecutiveOnes);
            }
        }
        return maxConsecutiveOnes;
    }
}