class Solution {
    public void reverse(int[] nums, int si, int ei) {
        for(int i = si, j = ei; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public void rotateArray(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
}