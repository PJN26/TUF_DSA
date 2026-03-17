/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



12345

1234

123

12

1



Print the pattern in the function given to you.


Example 1

Input: n = 4

Output:



Example 2

Input: n = 2

Output:



Constraints

1 <= n <= 100
*/

class Solution {
    public void pattern6(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}