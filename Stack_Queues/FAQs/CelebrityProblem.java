class Solution {
    public int celebrity(int[][] M) {
        int top = 0;
        int down = M.length - 1;

        while(top < down) {
            if(M[top][down] == 1) {
                top++;
            } else if(M[down][top] == 1) {
                down--;
            } else {
                top++;
                down--;
            }
        }

        if(top > down) return -1;

        for(int i = 0; i < M.length - 1; i++) {
            if(i == top) continue;
           if(!(M[top][i] == 0 && M[i][top] == 1)) return -1;    
        }
        return top;
    }
}