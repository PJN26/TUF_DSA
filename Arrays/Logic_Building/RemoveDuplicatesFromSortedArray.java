//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueElementIdx = 0;
        int lastUniqueElement = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != lastUniqueElement) {
                nums[++uniqueElementIdx] = nums[i];
                lastUniqueElement = nums[i];
            }
        }

        return uniqueElementIdx + 1;
    }
}