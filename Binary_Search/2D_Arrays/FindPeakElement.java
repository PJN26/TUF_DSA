//https://leetcode.com/problems/find-a-peak-element-ii/description/

class Solution {
    public int findMaxIdx(int[][] mat, int col) {
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;
        for(int i = 0; i < mat.length; i++) {
            if(max < mat[i][col]) {
                max = mat[i][col];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
    public int[] findPeakGrid(int[][] mat) {
      int low = 0, high = mat[0].length - 1;

      while(low <= high) {
        int col = low + (high - low) / 2;
        int row = findMaxIdx(mat, col);

        int left = col - 1 >= 0 ? mat[row][col - 1] : -1;
        int right = col + 1 < mat[0].length ? mat[row][col + 1] : -1;

        if (mat[row][col] > left && mat[row][col] > right) {
                return new int[]{row,col};  
            } 
            else if (left > mat[row][col]) {
                high = col - 1;  
            } 
            else {
                low = col + 1;
            }
      }
      return new int[]{-1, -1};
    }
}