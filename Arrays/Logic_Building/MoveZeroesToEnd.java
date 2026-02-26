//https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while(i < nums.length && j < nums.length) {
            while(j < nums.length && nums[j] != 0) {
                j++;
            }
            
            i = j + 1;

            while(i < nums.length && nums[i] == 0) {
                i++;
            }

            if(i < nums.length && j < nums.length) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
    }
}