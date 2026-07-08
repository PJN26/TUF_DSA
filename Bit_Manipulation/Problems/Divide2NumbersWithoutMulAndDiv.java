//https://leetcode.com/problems/divide-two-integers/description/

class Solution {
  public int divide(int dividend, int divisor) {
    if (dividend == divisor) return 1;
    if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
    if (divisor == 1) return dividend;
    boolean sign = true;
    if (dividend >= 0 && divisor < 0) sign = false;
    if (dividend <= 0 && divisor > 0) sign = false;

   long n = dividend;
        long d = divisor;
        
        n = Math.abs(n);
        d = Math.abs(d);
    int ans = 0;

    while (n >= d) {
      int count = 0;
      while (n >= (d << (count + 1))) {
        count++;
      }
      ans += (1 << count);
      n -= (d << count);
    }

    if (ans == 1 << 31 && sign) {
      return Integer.MAX_VALUE;
    }
    if (ans == 1 << 31 && !sign) {
      return Integer.MIN_VALUE;
    }

    return sign ? ans : (-1 * ans);
  }
}
