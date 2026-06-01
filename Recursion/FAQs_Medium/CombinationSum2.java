//https://leetcode.com/problems/combination-sum-ii/description/

class Solution {
    public void findCombinations(int idx, int[] candidates, int target, List<Integer> nums, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList<>(nums));
            return;
        }
        if(target < 0 || idx == candidates.length) {
            return;
        }
        nums.add(candidates[idx]);
        findCombinations(idx + 1, candidates, target - candidates[idx], nums, ans);

        nums.remove(nums.size() - 1);
        
        int j = idx + 1;

        while(j < candidates.length && candidates[j] == candidates[idx]) {
            j++;
        }

        findCombinations(j, candidates, target, nums, ans);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}