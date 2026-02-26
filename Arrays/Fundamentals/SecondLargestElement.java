/*
Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.


Example 1

Input: nums = [8, 8, 7, 6, 5]

Output: 7

Explanation:

The largest value in nums is 8, the second largest is 7

Example 2

Input: nums = [10, 10, 10, 10, 10]

Output: -1

Explanation:

The only value in nums is 10, so there is no second largest value, thus -1 is returned

Example 3

Input: nums = [7, 7, 2, 2, 10, 10, 10]

Output:

7
*/

class Solution {
    public int secondLargestElement(int[] nums) {
        if(nums.length < 2) {
            return-1;
        }
        int largest = nums[0];
        int slargest = Integer.MIN_VALUE;
        boolean isSlargest = false;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
                isSlargest = true;
            }
            else if(nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
                isSlargest = true;
            }
            else if(slargest == nums[i]) {
                isSlargest = true;
            }
        }
        if(isSlargest) {
            return slargest;
        }
        else {
            return -1;
        }
    }
}