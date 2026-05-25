//https://leetcode.com/problems/kth-missing-positive-number/description/
class Solution {
    public double myPow(double x, long n) {
          if(n < 0) {
            return 1 / myPow(x, -1*n);
          }

          if(n == 0) return 1.0;

          if(n % 2 != 0) {
            return x * myPow(x, n - 1);
          }
          else {
            return myPow(x * x, n/2);
          }
    }
}