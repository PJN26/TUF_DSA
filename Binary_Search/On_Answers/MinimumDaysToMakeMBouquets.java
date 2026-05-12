//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/


class Solution {
    public int roseGarden(int n, int[] nums, int k, int m) {

        if(m * k > n) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        int low = min;
        int high = max;

        while(low <= high) {
            int mid = low +(high - low) / 2;

            int count = 0, bouquets = 0;

            for(int i = 0; i < n; i++) {
                if(nums[i] <= mid) {
                    count++;
                }
                else {
                    bouquets += count / k;
                    count = 0;
                }
            }

            bouquets += count / k;

            if(bouquets >= m) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    } 
}