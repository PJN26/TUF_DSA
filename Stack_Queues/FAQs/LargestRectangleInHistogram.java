//https://leetcode.com/problems/largest-rectangle-in-histogram/description/

class Solution {

    public int[] getNSEE(int[] arr) {
        int[] ans = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if(!s.isEmpty()) {
                ans[i] = s.peek();
            }
            else {
                ans[i] = arr.length;
            }

            s.push(i);
        }

        return ans;
    }

    public int[] getPSEE(int[] arr) {
        int[] ans = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if(!s.isEmpty()) {
                ans[i] = s.peek();
            } else {
                ans[i] = -1;
            }

            s.push(i);
        }
        return ans;
    }

    public int largestRectangleArea(int[] heights) {
       int[] nsee = getNSEE(heights);
       int[] psee = getPSEE(heights);

       int maxArea = Integer.MIN_VALUE;

       for(int i = 0; i < heights.length; i++) {
            int length = nsee[i] - psee[i] - 1;

            int area = heights[i] * length;

            maxArea = Math.max(area, maxArea);
       }

       return maxArea;
    }
}

