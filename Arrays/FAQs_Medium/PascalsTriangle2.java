//https://leetcode.com/problems/pascals-triangle-ii/

import java.util.*;

class Solution {
    public long nCr(int n, int r) {
        if(r > n-r) {
            r = n - r;
        }

        if(r == 1) return n;

        long res = 1;

        for(long i = 0; i < r; i++) {
            res *= (n-i);
            res /= (i+1);
        }

        return res;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++) {
            ans.add((int)nCr(rowIndex, i));
        }

        return ans;
    }
}