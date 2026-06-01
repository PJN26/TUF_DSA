//https://leetcode.com/problems/subsets-ii/description/

import java.util.*;

class Solution {
    public void findSubsets(int idx, int[] nums, List<Integer> subset, List<List<Integer>> ans) {
        if(idx == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[idx]);
        findSubsets(idx + 1, nums, subset, ans);

        subset.remove(subset.size() - 1);

        int j = idx + 1;

        while(j < nums.length && nums[j] == nums[idx]) {
            j++;
        }

        findSubsets(j, nums, subset, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }
}