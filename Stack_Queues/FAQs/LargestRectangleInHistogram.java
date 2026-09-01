class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                int el = heights[s.peek()];
                s.pop();
                int nse = i;
                int pse = s.isEmpty() ? -1 : s.peek();

                int area = el * (nse - pse - 1);

                maxArea = Math.max(area, maxArea);
            }
            s.push(i);
        }

        while(!s.isEmpty()) {
            int nse = heights.length;

            int el = heights[s.peek()];
            s.pop();
            int pse = s.isEmpty() ? -1 : s.peek();

            maxArea = Math.max(maxArea, el * (nse - pse - 1));
        }
        return maxArea;
    }
}
