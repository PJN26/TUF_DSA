/*
Given a 2D array matrix that is row-wise sorted. The task is to find the median of the given matrix.


Example 1

Input: matrix=[ [1, 4, 9], [2, 5, 6], [3, 7, 8] ] 

Output: 5

Explanation: If we find the linear sorted array, the array becomes 1 2 3 4 5 6 7 8 9. So, median = 5

Example 2

Input: matrix=[ [1, 3, 8], [2, 3, 4], [1, 2, 5] ] 

Output: 3

Explanation: If we find the linear sorted array, the array becomes 1 1 2 2 3 3 4 5 8. So, median = 3

Example 3

Input: matrix=[ [1, 4, 15], [2, 5, 6], [3, 8, 11] ] 

Output:

5
Constraints

  N==matrix.size
  M==matrix[0].size
  1 <= N, M <= 105
  1 <= N*M <= 106
  1 <= matrix[i] <= 109
 N*M is odd
*/

class Solution {
    public int upperBound(int[] arr, int x) {
        int high = arr.length - 1;
        int low = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int countSmallEqual(int[][] matrix, int x) {
        int count = 0;

        for(int i = 0; i < matrix.length; i++) {
            count += upperBound(matrix[i], x);
        }
        return count;
    }

    public int findMedian(int[][] matrix) {
      int n = matrix.length;
      int m = matrix[0].length;

      int low = Integer.MAX_VALUE;
      int high = Integer.MIN_VALUE;

      for(int i = 0; i < n; i++) {
        low = Math.min(low, matrix[i][0]);
        high = Math.max(high, matrix[i][m - 1]);
      }

      int req = (n * m) / 2;

      while(low <= high) {
        int mid = low + (high - low) / 2;

        int smallEqual = countSmallEqual(matrix, mid);

        if(smallEqual <= req) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
      }
      return low;
    }
}