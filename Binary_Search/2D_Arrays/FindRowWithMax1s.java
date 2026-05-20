/*
Given a non-empty grid mat consisting of only 0s and 1s, where all the rows are sorted in ascending order, find the index of the row with the maximum number of ones.

If two rows have the same number of ones, consider the one with a smaller index. If no 1 exists in the matrix, return -1.


Example 1

Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]

Output: 0

Explanation: The row with the maximum number of ones is 0 (0 - indexed).

Example 2

Input: mat = [ [0, 0], [0, 0] ]

Output: -1

Explanation: The matrix does not contain any 1. So, -1 is the answer.

Example 3

Input : mat = [ [0, 0, 1], [0, 1, 1], [0, 1, 1] ]

Output:

1
Constraints

  n == mat.length 
  m == mat[i].length 
  1 <= n, m <= 100 
  mat[i][j] is either 0 or 1.
*/

class Solution {
    public int rowWithMax1s(int[][] mat) {
        int maxCount = 0;
        int idx = -1;
       for(int i = 0; i < mat.length; i++) {
        int low = 0;
        int high = mat[0].length - 1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(mat[i][mid] == 1) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            int count = mat[0].length - low;
            if(count > maxCount) {
                maxCount = count;
                idx = i;
            }
       }
       return idx; 
    }
}