/*
Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.



The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.


Example 1

Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation:

The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

Example 2

Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]

Output: [1, 3, 4, 5, 6, 7, 8, 9]

Explanation:

The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2

Example 3

Input: nums1 = [3, 4, 4, 4], nums2 = [6, 7, 7]

Output:

[3, 4, 6, 7]
Constraints

1 <= nums1.length, nums2.length <= 1000
-104 <= nums1[i] , nums2[i] <= 104
Both nums1 and nums2 are sorted in non-decreasing order
*/

import java.util.*;

class Solution {
  public int[] unionArray(int[] nums1, int[] nums2) {
    int i1 = 0;
    int i2 = 0;

    ArrayList<Integer> unionList = new ArrayList<>();
    if (nums1[i1] < nums2[i2]) {
      unionList.add(nums1[i1]);
      i1++;
    } else {
      unionList.add(nums2[i2]);
      i2++;
    }

    while (i1 < nums1.length && i2 < nums2.length) {
      while (i1 < nums1.length && nums1[i1] <= unionList.get(unionList.size() - 1)) {
        i1++;
      }

      while (i2 < nums2.length && nums2[i2] <= unionList.get(unionList.size() - 1)) {
        i2++;
      }

      if (i1 < nums1.length && i2 < nums2.length) {
        if (nums1[i1] < nums2[i2]) {
          unionList.add(nums1[i1]);
          i1++;
        } else {
          unionList.add(nums2[i2]);
          i2++;
        }
      }
    }

    while (i1 < nums1.length) {
      if (nums1[i1] != unionList.get(unionList.size() - 1)) {
        unionList.add(nums1[i1]);
      }
      i1++;
    }

    while (i2 < nums2.length) {
      if (nums2[i2] != unionList.get(unionList.size() - 1)) {
        unionList.add(nums2[i2]);
      }
      i2++;
    }

    int union[] = new int[unionList.size()];

    for (int i = 0; i < unionList.size(); i++) {
      union[i] = unionList.get(i);
    }

    return union;
  }
}
