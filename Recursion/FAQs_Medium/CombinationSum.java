//https://leetcode.com/problems/combination-sum/description/
import java.util.ArrayList;
import java.util.List;

class Solution {
    public void combinationSumHelper(int idx, int[] candidates, int target, List<Integer> currCombination, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList<>(currCombination));
            return;
        }
        if(target < 0 || idx == candidates.length) {
            return;
        }

        combinationSumHelper(idx + 1, candidates, target, currCombination, ans);

        currCombination.add(candidates[idx]);

        combinationSumHelper(idx, candidates, target - candidates[idx], currCombination, ans);
        
        currCombination.remove(currCombination.size() - 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        combinationSumHelper(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }
}