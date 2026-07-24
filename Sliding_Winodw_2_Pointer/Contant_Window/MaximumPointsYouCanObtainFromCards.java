//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] cardScore, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxPoints = 0;

        for(int i = 0; i < k; i++) {
            lsum += cardScore[i];
        }

        maxPoints = lsum;
        int r = cardScore.length - 1;

        for(int i = k - 1; i >= 0; i--) {
            lsum -= cardScore[i];
            rsum += cardScore[r];

            r--;

            maxPoints = Math.max(maxPoints, lsum + rsum);
        }

        return maxPoints;
    }
}