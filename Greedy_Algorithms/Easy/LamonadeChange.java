//https://leetcode.com/problems/lemonade-change/description/

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int D5 = 0;
        int D10 = 0;
        int D20 = 0;

        for(int i = 0; i < bills.length; i++) {
            if(bills[i] == 5) {
                D5++;
            } else if(bills[i] == 10) {
                D10++;
                D5--;
            } else {
                D20++;
                if(D10 > 0) {
                    D10--;
                    D5--;
                } else {
                    D5 -= 3;
                }
            }
            if(D5 < 0 || D10 < 0 || D20 < 0) return false; 
        }

        return true;
    }
}