//https://leetcode.com/problems/remove-k-digits/description/

class Solution {
    public String removeKdigits(String nums, int k) {
       if(nums.length() == k) return "0";

       Stack<Character> s = new Stack<>();

       for(int i = 0; i < nums.length(); i++) {
            char ch = nums.charAt(i);

            while(!s.isEmpty() && k > 0 && s.peek() > ch) {
                s.pop();
                k--;
            }

            s.push(ch);
       }

       StringBuilder sb = new StringBuilder("");

       while(!s.isEmpty() && k > 0) {
        s.pop();
        k--;
       }

       if(s.isEmpty()) return "0";

       while(!s.isEmpty()) {
        sb.append(s.pop());
       }

       while(sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
       }

       if(sb.length() == 0) return "0";

       return sb.reverse().toString();
    }
}