//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

class Solution {
    public int smallestDivisor(int[] nums, int limit) {
       int max = Integer.MIN_VALUE;

       for(int i = 0; i < nums.length; i++) {
        max = Math.max(nums[i], max);
       }

       int low = 1;
       int high = max;

       while(low <= high) {
        int mid = low + (high - low) / 2;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double)nums[i] / (double)mid);
        }

        if(sum <= limit) {
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
       }
       return low;
    }
}