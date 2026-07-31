/*
Given a string s and an integer k.Find the length of the longest substring with at most k distinct characters.


Example 1

Input : s = "aababbcaacc" , k = 2

Output : 6

Explanation : The longest substring with at most two distinct characters is "aababb".

The length of the string 6.

Example 2

Input : s = "abcddefg" , k = 3

Output : 4

Explanation : The longest substring with at most three distinct characters is "bcdd".

The length of the string 4.

Now your turn!

Input : s = "abccab" , k = 4

Output:

Pick your answer


3

4

6

5
Constraints

1 <= s.length <= 105
1 <= k <= 26
*/

class Solution {
    public int kDistinctChar(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int longest = 0;

        int i = 0;
        int j = 0;

        while(j < s.length()) {
            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.size() > k) {
                char chi = s.charAt(i);
                map.put(chi, map.get(chi) - 1);
                if(map.get(chi) == 0) map.remove(chi);
                i++;
            }
            if(map.size() <= k) longest = Math.max(longest, j - i + 1);

            j++;
        }
        return longest;
    }
}