//https://leetcode.com/problems/single-number-iii/description/

class Solution {    
    public int[] singleNumber(int[] nums) {        
        long xor = 0;

        for(int x : nums) {
            xor ^= x;
        }

        int rightMost1 = (int)((xor & (xor - 1))) ^ (int)xor;

        int b1 = 0;
        int b2 = 0;

        for(int x : nums) {
            if((x & rightMost1) != 0) {
                b1 ^= x;
            } else {
                b2 ^= x;
            }
        }
        return new int[]{b2, b1};
    }
}