//https://leetcode.com/problems/generate-parentheses/description/

class Solution {
    public void generate(int n, String s, int open, int close, List<String> parenthesis) {
        if(open > n) {
            return;
        }
        if(open + close == n * 2) {
            if(open == close) {
                parenthesis.add(s);
            }
            return;
        }
        if(open < n) generate(n, s + "(", open + 1, close, parenthesis);
        if(open > close) generate(n, s + ")", open, close + 1, parenthesis);
    }
    public List<String> generateParenthesis(int n) {
        //your code goes here
        List<String> ans = new ArrayList<>();
        generate(n, "", 0, 0, ans);
        return ans;
    }
}