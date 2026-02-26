//https://www.geeksforgeeks.org/dsa/leaders-in-an-array/
import java.util.*;
class Solution {
    public List<Integer> leaders(int[] nums) {
        List<Integer> leadersOfNums = new ArrayList<>();

        leadersOfNums.add(nums[nums.length - 1]);

        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] > leadersOfNums.get(leadersOfNums.size() - 1)) {
                leadersOfNums.add(nums[i]);
            }
        }

        Collections.reverse(leadersOfNums);

        return leadersOfNums;
    }
}