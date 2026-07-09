//https://leetcode.com/problems/subsets/description/

class Solution {
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        int count = (1 << n);

        for(int i = 0; i < count; i++) {
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < n; j++) {
                if((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}