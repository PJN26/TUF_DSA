/*
Check if there exists a subsequence with sum K
Easy

Hints
Company
Given an array nums and an integer k. R﻿eturn true if there exist subsequences such that the sum of all elements in subsequences is equal to k else false.


Example 1

Input : nums = [1, 2, 3, 4, 5] , k = 8

Output : Yes

Explanation : The subsequences like [1, 2, 5] , [1, 3, 4] , [3, 5] sum up to 8.

Example 2

Input : nums = [4, 3, 9, 2] , k = 10

Output : No

Explanation : No subsequence can sum up to 10.

Example 3

Input : nums = [1, 10, 4, 5] , k = 16

Output:

true
Constraints

1 <= nums.length <= 20
1 <= nums[i] <= 100
1 <= k <= 2000
*/

class Solution {
    public boolean solve(int idx, int nums[], int target) {
        if(target == 0) {
            return true;
        }
        if(target < 0 || idx == nums.length) {
            return false;
        }
        return solve(idx + 1, nums, target - nums[idx]) || solve(idx + 1, nums, target);
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
         //your code goes here
         return solve(0, nums, k);
    }
}