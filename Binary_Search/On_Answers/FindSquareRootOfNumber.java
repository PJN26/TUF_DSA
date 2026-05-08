/*
Find square root of a number
Medium

Hints
Company
Given a positive integer n. Find and return its square root. If n is not a perfect square, then return the floor value of sqrt(n).


Example 1

Input: n = 36

Output: 6

Explanation: 6 is the square root of 36.

Example 2

Input: n = 28

Output: 5

Explanation: The square root of 28 is approximately 5.292. So, the floor value will be 5.

Example 3

Input: n=50

Output:

7
Constraints

 0 <= n <= 231 - 1
*/

class Solution {
    public int floorSqrt(int n) {
      int low = 1;
      int high = n;

      while(low <= high) {
        int mid = low + (high - low) / 2;
        if((long)mid * (long)mid <= (long)n) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
      }
      return high;
    }
}