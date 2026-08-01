//https://leetcode.com/problems/longest-repeating-character-replacement/

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int maxFreq = 0;

        while(r < s.length()) {
            char ch = s.charAt(r);

            freq[ch - 'A']++;
            maxFreq = Math.max(freq[ch - 'A'], maxFreq);

            if((r - l + 1) - maxFreq > k) {
                char chl = s.charAt(l);
                freq[chl - 'A']--;
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }
}