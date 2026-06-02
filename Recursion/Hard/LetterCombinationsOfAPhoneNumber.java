//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.*;

class Solution {
    private static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public void combinations(String digits, StringBuilder sb, int idx,List<String> ans) {
        if(idx == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String letters = map[digits.charAt(idx) - '0'];

        for(int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            combinations(digits, sb, idx + 1, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        combinations(digits, new StringBuilder(), 0, ans);

        return ans;
        
    }
}