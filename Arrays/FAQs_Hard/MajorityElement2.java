//https://leetcode.com/problems/majority-element-ii/

import java.util.*;

class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        int el1 = Integer.MAX_VALUE;
        int el2 = Integer.MAX_VALUE;
        int el1Count = 0;
        int el2Count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(el1Count == 0 && el2 != nums[i]) {
                el1Count = 1;
                el1 = nums[i];
            }
            else if(el2Count == 0 && el1 != nums[i]) {
                el2Count = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) {
                el1Count++;
            }
            else if(el2 == nums[i]) {
                el2Count++;
            }
            else {
                el1Count--;
                el2Count--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        el1Count = 0;
        el2Count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == el1) {
                el1Count++;
            }
            if(nums[i] == el2) {
                el2Count++;
            }
        }

        if(el1Count > nums.length / 3) {
            ans.add(el1);
        }

        if(el2Count > nums.length / 3) {
            ans.add(el2);
        }

        return ans;
    }
}