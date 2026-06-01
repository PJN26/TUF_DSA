/*
Subsets I
Medium

Hints
Company
Given an array nums of n integers. Return array of sum of all subsets of the array nums.



Output can be returned in any order.


Example 1

Input : nums = [2, 3]

Output : [0, 2, 3, 5]

Explanation :

When no elements is taken then Sum = 0.

When only 2 is taken then Sum = 2.

When only 3 is taken then Sum = 3.

When element 2 and 3 are taken then sum = 2+3 = 5.

Example 2

Input : nums = [5, 2, 1]

Output : [0, 1, 2, 3, 5, 6, 7, 8]

Explanation :

When no elements is taken then Sum = 0.

When only 5 is taken then Sum = 5.

When only 2 is taken then Sum = 2.

When only 1 is taken then Sum = 1.

When element 2 and 1 are taken then sum = 2+1 = 3.

Example 3

Input : nums = [1]

Output:

[0, 1]
Constraints

1 <= n <= 15
0 <= nums[i] <= 104
*/
import java.util.*;

class Solution {
    public void findSum(int idx, int[] nums, int sum, List<Integer> ans) {
        if(idx == nums.length) {
            ans.add(sum);
            return;
        }
        findSum(idx + 1, nums, sum + nums[idx], ans);
        findSum(idx + 1, nums, sum, ans);
    }
    public List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        findSum(0, nums, 0, ans);
        return ans;
    }
}