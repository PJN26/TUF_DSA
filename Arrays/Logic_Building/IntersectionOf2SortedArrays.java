import java.util.*;

class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else {
                i++;
            }
        }

        int[] intersection = new int[list.size()];

        for(int idx = 0; idx < list.size(); idx++) {
            intersection[idx] = list.get(idx);
        }

        return intersection;
    }
}