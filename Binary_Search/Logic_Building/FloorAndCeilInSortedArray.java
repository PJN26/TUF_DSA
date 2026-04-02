/*
Given a sorted array nums and an integer x. Find the floor and ceil of x in nums. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x. If no floor or ceil exists, output -1.


Example 1

Input : nums =[3, 4, 4, 7, 8, 10], x= 5

Output: 4 7

Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

Example 2

Input : nums =[3, 4, 4, 7, 8, 10], x= 8

Output: 8 8

Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.

Now your turn!

Input : nums = [2, 4, 6, 8, 10, 12, 14], x= 1

Output:

Pick your answer


[2, 14]

[-1, 2]

[-1, 14]

[2, -1]
Constraints

  1 <= nums.length <= 105 
  0 < nums[i], x < 105 
  nums is sorted in ascending order.
*/

class Solution {
  public int[] getFloorAndCeil(int[] nums, int x) {
    int floor = -1;
    int ceil = -1;

    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] <= x) {
        floor = nums[mid];
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    low = 0;
    high = nums.length - 1;

    while(low <= high) {
        int mid = low + (high - low) / 2;

        if(nums[mid] >= x) {
            ceil = nums[mid];
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
    }

    return new int[]{floor, ceil};
  }
}
