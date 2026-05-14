/*
Given an array nums of n integers, where nums[i] represents the number of pages in the i-th book, and an integer m representing the number of students, allocate all the books to the students so that each student gets at least one book, each book is allocated to only one student, and the allocation is contiguous.



Allocate the books to m students in such a way that the maximum number of pages assigned to a student is minimized. If the allocation of books is not possible, return -1.


Example 1

Input: nums = [12, 34, 67, 90], m=2

Output: 113

Explanation: The allocation of books will be 12, 34, 67 | 90. One student will get the first 3 books and the other will get the last one.

Example 2

Input: nums = [25, 46, 28, 49, 24], m=4

Output: 71

Explanation: The allocation of books will be 25, 46 | 28 | 49 | 24.

Example 3

Input: nums = [15, 17, 20], m=2

Output:

32
Constraints

  1 <= n, m <= 104
  1 <= nums[i] <= 105
*/

class Solution {
    public int countStudents(int[] nums, int maxPages) {
        int students = 1, pageStudent = 0;

        for(int i = 0; i < nums.length; i++){
            if(pageStudent + nums[i] <= maxPages) {
                pageStudent += nums[i];
            }
            else {
                students++;
                pageStudent = nums[i];
            }
        }

        return students;
    }

    public int findPages(int[] nums, int m) {
        if(m > nums.length) return -1;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }

            sum += nums[i];
        }

        int low = max, high = sum;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int students = countStudents(nums, mid);

            if(students > m) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
}