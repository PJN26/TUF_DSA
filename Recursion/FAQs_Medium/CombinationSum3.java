//https://leetcode.com/problems/combination-sum-iii/description/

import java.util.*;

class Solution {
    public void findCombinations(int num, int k, int target, List<Integer> nums, List<List<Integer>> ans) {
        if(target == 0) {
            if(nums.size() == k) {
                ans.add(new ArrayList<>(nums));
            }
            return;
        }
        if(target < 0 || num == 10 || nums.size() > k) {
            return;
        }
        nums.add(num);
        findCombinations(num + 1, k, target - num, nums, ans);
        nums.remove(nums.size() - 1);
        findCombinations(num + 1, k, target, nums, ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(1, k, n, new ArrayList<>(), ans);
        return ans;
    }
}