//https://leetcode.com/problems/non-overlapping-intervals/

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int lastEnd = Integer.MIN_VALUE;
        int count = 0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));

        for(int i = 0; i < intervals.length; i++) {
            if(intervals[i][0] < lastEnd) {
                count++;
            } else {
                lastEnd = intervals[i][1];
            }
        }
        return count;
    }
}