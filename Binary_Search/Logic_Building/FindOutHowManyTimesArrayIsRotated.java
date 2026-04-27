/*
Find out how many times the array is rotated
Easy

Hints
Company
Given an integer array nums of size n, sorted in ascending order with distinct values. The array has been right rotated an unknown number of times, between 0 and n-1 (including). Determine the number of rotations performed on the array.


Example 1

Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]

Output: 4

Explanation: The original array should be [0, 1, 2, 3, 4, 5, 6, 7]. So, we can notice that the array has been rotated 4 times.

Example 2

Input: nums = [3, 4, 5, 1, 2]

Output: 3

Explanation: The original array should be [1, 2, 3, 4, 5]. So, we can notice that the array has been rotated 3 times.

Now your turn!

Input: nums = [4, 5, 1, 2]

Output:

2


Constraints

 n == nums.length
 1 <= n <= 104
 -104 <= nums[i] <= 104
 All the integers of nums are unique.
*/

class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;
        int min = Integer.MAX_VALUE;
        int minIdx = 0;

        while(low <= high) {
        int mid = low + (high - low) / 2;
        if(nums.get(low) <= nums.get(mid)) {
            if(nums.get(low) < min) {
                min = nums.get(low);
                minIdx = low;
            }
            low = mid + 1;
        }
        else {
            if(nums.get(mid) < min) {
                min = nums.get(mid);
                minIdx = mid;
            }
            high = mid - 1;
        }
      }
      return minIdx;
    }
}