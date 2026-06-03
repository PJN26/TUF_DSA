//https://leetcode.com/problems/n-queens/description/

class Solution {
    public boolean isSafe(int row, int col, List<StringBuilder> board) {
        int i = row;
        int j = col;

        while(i >= 0) {
            StringBuilder currRow = board.get(i);
            if(currRow.charAt(j) == 'Q') return false;
            i--;
        }

        i = row;
        j  = col;
        while(i >= 0 && j >= 0) {
            StringBuilder currRow = board.get(i);
            if(currRow.charAt(j) == 'Q') return false;
            i--;
            j--;
        }

        i = row;
        j  = col;
        while(i >= 0 && j < board.get(i).length()) {
            StringBuilder currRow = board.get(i);
            if(currRow.charAt(j) == 'Q') return false;
            i--;
            j++;
        }

        return true;
    }

    public void placeQueen(int row, List<StringBuilder> board, List<List<String>> ans) {
        if(row == board.size()) {
            List<String> ansBoard = new ArrayList<>();

            for(int i = 0; i < board.size(); i++) {
                ansBoard.add(board.get(i).toString());
            }

            ans.add(ansBoard);
            return;
        }


        StringBuilder currRow = board.get(row);

        for(int i = 0; i < board.size(); i++) {
            if(isSafe(row, i, board)) {
                currRow.setCharAt(i, 'Q');
                placeQueen(row + 1, board, ans);
                currRow.setCharAt(i , '.');
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<StringBuilder> board = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");

        for(int i = 1; i <= n; i++) {
            sb.append(".");
        }

        for(int i = 1; i <= n; i++) {
            board.add(new StringBuilder(sb));
        }

        placeQueen(0, board, ans);

        return ans;
    }
}