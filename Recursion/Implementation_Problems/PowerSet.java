//https://leetcode.com/problems/subsets/description/
import java.util.*;
class Solution {
    public void generatePowerSet(int[] nums, int idx, List<Integer> set,List<List<Integer>> powerSet) {
        if(idx == nums.length) {
            powerSet.add(new ArrayList<>(set));
            return;
        }
        generatePowerSet(nums, idx + 1, set, powerSet);
        set.add(nums[idx]);
        generatePowerSet(nums, idx + 1, set, powerSet);
        set.remove(set.size() - 1);
    }
    public List<List<Integer>> powerSet(int[] nums) {
        //your code goes here
        List<List<Integer>> powerSet = new ArrayList<>();
        generatePowerSet(nums, 0, new ArrayList<>(), powerSet);
        return powerSet;
    }
}