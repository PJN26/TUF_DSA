//https://leetcode.com/problems/pascals-triangle/description/
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        List<Integer> numRow1 = new ArrayList<>();
        numRow1.add(1);
        pascalTriangle.add(numRow1);
        for(int i = 2; i <= numRows; i++) {
            List<Integer> currList = new ArrayList<>();
            List<Integer> prevList = pascalTriangle.get(i-2);
            currList.add(1);
            for(int j = 2; j < i; j++) {
                currList.add(prevList.get(j-2) + prevList.get(j-1));
            }
            currList.add(1);
            pascalTriangle.add(currList);
        }
        return pascalTriangle;
    }
}