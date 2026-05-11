//https://leetcode.com/problems/koko-eating-bananas/description/

class Solution {
    public int minimumRateToEatBananas(int[] nums, int h) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        int low = 1;
        int high = max;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int hrs = 0;

            for(int i = 0; i < nums.length; i++) {
                hrs += Math.ceil((double)nums[i] / (double)mid);
            }

            if(hrs <= h) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}