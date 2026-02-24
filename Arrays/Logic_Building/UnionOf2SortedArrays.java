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
