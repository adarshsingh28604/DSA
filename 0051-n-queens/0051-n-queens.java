class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, board, ans);

        return ans;
    }

    void backtrack(int row, char[][] board, List<List<String>> ans) {

        if (row == board.length) {
            List<String> list = new ArrayList<>();

            for (char[] r : board) {
                list.add(new String(r));
            }

            ans.add(list);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(row, col, board)) {

                board[row][col] = 'Q';

                backtrack(row + 1, board, ans);

                board[row][col] = '.';
            }
        }
    }

    boolean isSafe(int row, int col, char[][] board) {

        // Same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}