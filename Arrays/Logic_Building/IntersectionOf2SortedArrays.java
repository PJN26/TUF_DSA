/*
Given two sorted arrays, nums1 and nums2, return an array containing the intersection of these two arrays. Each element in the result must appear as many times as it appears in both arrays; that is, if an element appears x times in nums1 and y times in nums2, it should appear min(x, y) times in the result.



The intersection of two arrays is an array where all values are present in both arrays.


Example 1

Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]

Output: [1, 2]

Explanation:

The elements 1, 2 are the only elements present in both nums1 and nums2

Example 2

Input: nums1 = [1, 2, 2, 3, 3, 3], nums2 = [2, 3, 3, 4, 5, 7]

Output: [2, 3, 3]

Explanation:

The element 2 appears in both arrays only one time.

The element 3 appears in both arrays two times so we add element 3 equal to its number of occurrences.

Example 3

Input: nums1 = [-45, -45, 0, 0, 2], nums2 = [-50, -45, 0, 0, 5, 7]

Output:

[-45, 0, 0]
Constraints

1 <= nums1.length, nums2.length <= 1000
-104 <= nums1[i], nums2[i] <= 104
Both nums1 and nums2 are sorted in non-decreasing order.
*/

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