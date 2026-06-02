//https://leetcode.com/problems/palindrome-partitioning/description/

import java.util.*;

class Solution {

    public boolean isPalindrome(String s, int si, int ei) {
        while(si <= ei) {
            if(s.charAt(si) != s.charAt(ei)) {
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public void findPartition(int idx, String s, List<String> list, List<List<String>> ans) {
        if(idx == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx; i < s.length(); i++) {
            if(isPalindrome(s, idx, i)) {
                String sub = s.substring(idx, i+1);
                list.add(sub);
                findPartition(i+1, s, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        findPartition(0, s, new ArrayList<>(), ans);
        return ans;
    }
}