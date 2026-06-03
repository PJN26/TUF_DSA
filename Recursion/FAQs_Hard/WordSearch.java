//https://leetcode.com/problems/word-search/description/

class Solution {
  public boolean search(int idx, int row, int col, char[][] board, String word) {
    if (idx == word.length()) {
      return true;
    }
    char ch = word.charAt(idx);
    if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != ch) {
      return false;
    }
    board[row][col] = ' ';
    boolean ans =
        search(idx + 1, row - 1, col, board, word)
            || search(idx + 1, row + 1, col, board, word)
            || search(idx + 1, row, col - 1, board, word)
            || search(idx + 1, row, col + 1, board, word);
    board[row][col] = ch;
    return ans;
  }

  public boolean exist(char[][] board, String word) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == word.charAt(0) && search(0, i, j, board, word)) {
          return true;
        }
      }
    }
    return false;
  }
}
