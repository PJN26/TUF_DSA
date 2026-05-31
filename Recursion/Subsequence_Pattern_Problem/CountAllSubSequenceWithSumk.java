/*
Count all subsequences with sum K
Easy

Hints
Company
Given an array nums and an integer k.Return the number of non-empty subsequences of nums such that the sum of all elements in the subsequence is equal to k.


Example 1

Input : nums = [4, 9, 2, 5, 1] , k = 10

Output : 2

Explanation : The possible subsets with sum k are [9, 1] , [4, 5, 1].

Example 2

Input : nums = [4, 2, 10, 5, 1, 3] , k = 5

Output : 3

Explanation : The possible subsets with sum k are [4, 1] , [2, 3] , [5].

Now your turn!

Input : nums = [1, 10, 4, 5] , k = 16

Output:

Pick your answer


2

1

3

10
Constraints

1 <= nums.length <= 20
1 <= nums[i] <= 100
1 <= k <= 2000
*/

class Solution {
    public int solve(int idx, int nums[], int target) {
        if(target == 0) {
            return 1;
        }
        if(target < 0 || idx == nums.length) {
            return 0;
        }
        return solve(idx + 1, nums, target - nums[idx]) + solve(idx + 1, nums, target);
    }
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return solve(0, nums, k);
    }
}