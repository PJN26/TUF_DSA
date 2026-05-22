//https://leetcode.com/problems/search-a-2d-matrix-ii/description/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int row = 0, col = matrix[0].length - 1;

      while(row < matrix.length && col >= 0) {
        if(matrix[row][col] == target) {
            return true;
        }
        else if(matrix[row][col] > target) {
            col--;
        }
        else {
            row++;
        }
      }
      return false;
    }
}