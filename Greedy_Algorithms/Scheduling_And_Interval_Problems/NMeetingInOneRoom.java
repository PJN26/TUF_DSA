/*
N meetings in one room
Hints
Company
Given one meeting room and N meetings represented by two arrays, start and end, where start[i] represents the start time of the ith meeting and end[i] represents the end time of the ith meeting, determine the maximum number of meetings that can be accommodated in the meeting room if only one meeting can be held at a time.


Example 1

Input : Start = [1, 3, 0, 5, 8, 5] , End = [2, 4, 6, 7, 9, 9]

Output : 4

Explanation : The meetings that can be accommodated in meeting room are (1,2) , (3,4) , (5,7) , (8,9).

Example 2

Input : Start = [10, 12, 20] , End = [20, 25, 30]

Output : 1

Explanation : Given the start and end time, only one meeting can be held in meeting room.

Now your turn!

Input : Start = [1, 4, 6, 9] , End = [2, 5, 7, 12]

Output:

Pick your answer


2

4

1

3
Constraints

1 <= N <= 105
0 <= start[i] < end[i] <= 105
*/

class Solution {
    public int maxMeetings(int[] start, int[] end) {
       int[][] meetingWithTime = new int[start.length][2];

       int currTime = -1;
       int meetingCount = 0;

       for(int i = 0; i < start.length; i++) {
        meetingWithTime[i][0] = start[i];
        meetingWithTime[i][1] = end[i];
       }

       Arrays.sort(meetingWithTime, (a,b) -> Integer.compare(a[1], b[1]));

       for(int i = 0; i < meetingWithTime.length; i++) {
        if(meetingWithTime[i][0] > currTime) {
            meetingCount++;
            currTime = meetingWithTime[i][1];
        }
       }
       return meetingCount;
    }
}