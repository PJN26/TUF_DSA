//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int longestNonRepeatingSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;

        int[] lastIdx = new int[26];

        Arrays.fill(lastIdx, -1);

        while(j < s.length()) {
            char ch = s.charAt(j);

            if(lastIdx[ch - 'a'] >= i) {
                i = lastIdx[ch - 'a'] + 1;
            }
            
            lastIdx[ch - 'a'] = j;

            maxLength = Math.max(j - i + 1, maxLength);
            j++;
        }
        return maxLength;
    }
}