//https://leetcode.com/problems/fruit-into-baskets/description/

class Solution {
    public int totalFruits(int[] fruits) {
        int l = 0;
        int r = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLength = -1;

        while(r < fruits.length) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            if(map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }

            if(map.size() <= 2) maxLength = Math.max(maxLength, r-l+1);

            r++;
        }
        return maxLength;
    }
}