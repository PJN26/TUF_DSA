/*
Given an array nums of size n, which denotes the positions of stalls, and an integer k, which denotes the number of aggressive cows, assign stalls to k cows such that the minimum distance between any two cows is the maximum possible. Find the maximum possible minimum distance.


Example 1

Input: n = 6, k = 4, nums = [0, 3, 4, 7, 10, 9]

Output: 3

Explanation:

The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions [0, 3, 7, 10]. Here the distances between cows are 3, 4, and 3 respectively.

In no manner can we increase the minimum distance beyond 3.

Example 2

Input : n = 5, k = 2, nums = [4, 2, 1, 3, 6]

Output: 5

Explanation: The maximum possible minimum distance between any two cows will be 5 when 2 cows are placed at positions [1, 6]. 

Example 3

Input : n = 5, k = 3, nums = [10, 1, 2, 7, 5]

Output:

4
Constraints

  2 <= n <= 105
  2 <= k <= n
  0 <= nums[i] <= 109
*/

class Solution {

    public boolean canWePlace(int[] nums, int dist, int k) {
        int last = nums[0], cows = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - last >= dist) {
                cows++;
                last = nums[i];
            }
        }
        return cows >= k;
    }
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);

        int low = 1;
        int high = nums[nums.length - 1] - nums[0];
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(canWePlace(nums, mid, k)) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return high;
    }
}
