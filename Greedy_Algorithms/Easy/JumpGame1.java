//https://leetcode.com/problems/jump-game/description/

class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;

        for(int i = 0; i < nums.length; i++) {
            if(maxIdx < i) {
                return false;
            }
            int nextIdx = i + nums[i];

            if(nextIdx > maxIdx) {
                maxIdx = nextIdx;
            }
        }
        return true;
    }
}