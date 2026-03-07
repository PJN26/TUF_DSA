/*
Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.



Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.



Note: You are not allowed to modify the original array.


Example 1

Input: nums = [3, 5, 4, 1, 1]

Output: [1, 2]

Explanation:

1 appears two times in the array and 2 is missing from nums

Example 2

Input: nums = [1, 2, 3, 6, 7, 5, 7]

Output: [7, 4]

Explanation:

7 appears two times in the array and 4 is missing from nums.

Now your turn!

Input: nums = [6, 5, 7, 1, 8, 6, 4, 3, 2]

Output:

Pick your answer


[6, 9]

[9, 6]

[10, 6]

[6, 8]
Constraints

n == nums.length
1 <= n <= 105
n - 2 elements in nums appear exactly once and are valued between [1, n].
1 element in nums appears twice, and is valued between [1, n].
*/

import java.util.*;

class Solution {
    // Function to find repeating and missing numbers
    public int[] findMissingRepeatingNumbers(int[] nums) {
        
        // Size of the array
        long n = nums.length;

        // Sum of first n natural numbers
        long SN = (n * (n + 1)) / 2;

        // Sum of squares of first n natural numbers
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        /* Calculate actual sum (S) and sum 
           of squares (S2) of array elements */
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long) nums[i] * (long) nums[i];
        }

        // Compute the difference values
        long val1 = S - SN;

        // S2 - S2n = X^2 - Y^2
        long val2 = S2 - S2N;

        // Calculate X + Y using X + Y = (X^2 - Y^2) / (X - Y)
        val2 = val2 / val1;

        /* Calculate X and Y from X + Y and X - Y
           X = ((X + Y) + (X - Y)) / 2
           Y = X - (X - Y) */
        long x = (val1 + val2) / 2;
        long y = x - val1;

        // Return the results as [repeating, missing]
        return new int[]{(int) x, (int) y};
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        // Create an instance of Solution class
        Solution sol = new Solution();

        int[] result = sol.findMissingRepeatingNumbers(nums);

        // Print the repeating and missing numbers found
        System.out.printf("The repeating and missing numbers are: {%d, %d}\n", result[0], result[1]);
    }
}
