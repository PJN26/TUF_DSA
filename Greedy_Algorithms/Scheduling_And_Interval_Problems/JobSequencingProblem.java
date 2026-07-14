/*
Job sequencing Problem
Hints
Company
Given an 2D array Jobs of size Nx3, where Jobs[i][0] represents JobID , Jobs[i][1] represents Deadline , Jobs[i][2] represents Profit associated with that job. Each Job takes 1 unit of time to complete and only one job can be scheduled at a time.



The profit associated with a job is earned only if it is completed by its deadline. Find the number of jobs and maximum profit.


Example 1

Input : Jobs = [ [1, 4, 20] , [2, 1, 10] , [3, 1, 40] , [4, 1, 30] ]

Output : 2 60

Explanation : Job with JobID 3 can be performed at time t=1 giving a profit of 40.

Job with JobID 1 can be performed at time t=2 giving a profit of 20.

No more jobs can be scheduled, So total Profit = 40 + 20 => 60.

Total number of jobs completed are two, JobID 1, JobID 3.

So answer is 2 60.

Example 2

Input : Jobs = [ [1, 2, 100] , [2, 1, 19] , [3, 2, 27] , [4, 1, 25] , [5, 1, 15] ]

Output : 2 127

Explanation : Job with JobID 1 can be performed at time time t=1 giving a profit of 100.

Job with JobID 3 can be performed at time t=2 giving a profit of 27.

No more jobs can be scheduled, So total Profit = 100 + 27 => 127.

Total number of jobs completed are two, JobID 1, JobID 3.

So answer is 2 127.

Now your turn!

Input : Jobs = [ [1, 1, 100] , [2, 2, 200] , [3, 3, 300] , [4, 4, 400] ]

Output:

Pick your answer


3 1000

3 800

4 1000

4 800
Constraints

1 <= N <= 104
1 <= Deadline <= N
1 <= Profit <= 500
*/

class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        int n = Jobs.length;
        int maxDeadline = 0;
        int profit = 0;
        int jobCount = 0;
        
        Arrays.sort(Jobs, (a,b) -> Integer.compare(b[2], a[2]));

        for(int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, Jobs[i][1]);
        }

        int hash[] = new int[maxDeadline + 1];

        for(int i = 0; i < n; i++) {
            int currDeadline = Jobs[i][1];

            for(int j = currDeadline; j > 0; j--) {
                if(hash[j] == 0) {
                    hash[j] = Jobs[i][0];
                    profit += Jobs[i][2];
                    jobCount++;
                    break;
                }
            }
        }
        return new int[]{jobCount, profit};
    }
}