//https://leetcode.com/problems/count-number-of-nice-subarrays/description/

class Solution {
    public int countSubArrays(int[] nums, int k) {
        if(k < 0) return 0;

        int l = 0;
        int r = 0;
        int count = 0;
        int odd = 0;

        while(r < nums.length) {
            if(nums[r] % 2 == 1) odd++;

            while(odd > k) {
                if(nums[l] % 2 == 1) odd--;
                l++;
            }

            count += r - l + 1;
            r++;
        }
        return count;
    }
    public int numberOfOddSubarrays(int[] nums, int k) {
        int lek = countSubArrays(nums, k);
        int lk = countSubArrays(nums, k - 1);

        return lek - lk;
    }
}