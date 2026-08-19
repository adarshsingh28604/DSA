class Solution {
    int n;
    public boolean checkValidGrid(int[][] grid) {
        n = grid.length;
        // Knight tour must start from (0,0)
        if (grid[0][0] != 0) {
            return false;
        }
        return horse(1, 0, 0, grid);
    }
    private boolean horse(int num, int row, int col, int[][] ans) {
        // All cells visited
        if (num == n * n) {
            return true;
        }
        // up left
        if (row - 2 >= 0 && col - 1 >= 0
                && ans[row - 2][col - 1] == num) {

            if (horse(num + 1, row - 2, col - 1, ans)) {
                return true;
            }
        }
        // up right
        if (row - 2 >= 0 && col + 1 < n
                && ans[row - 2][col + 1] == num) {

            if (horse(num + 1, row - 2, col + 1, ans)) {
                return true;
            }
        }

        // down left
        if (row + 2 < n && col - 1 >= 0
                && ans[row + 2][col - 1] == num) {

            if (horse(num + 1, row + 2, col - 1, ans)) {
                return true;
            }
        }

        // down right
        if (row + 2 < n && col + 1 < n
                && ans[row + 2][col + 1] == num) {

            if (horse(num + 1, row + 2, col + 1, ans)) {
                return true;
            }
        }

        // right up
        if (row - 1 >= 0 && col + 2 < n
                && ans[row - 1][col + 2] == num) {

            if (horse(num + 1, row - 1, col + 2, ans)) {
                return true;
            }
        }

        // right down
        if (row + 1 < n && col + 2 < n
                && ans[row + 1][col + 2] == num) {

            if (horse(num + 1, row + 1, col + 2, ans)) {
                return true;
            }
        }

        // left up
        if (row - 1 >= 0 && col - 2 >= 0
                && ans[row - 1][col - 2] == num) {

            if (horse(num + 1, row - 1, col - 2, ans)) {
                return true;
            }
        }
        // left down
        if (row + 1 < n && col - 2 >= 0
                && ans[row + 1][col - 2] == num) {
            if (horse(num + 1, row + 1, col - 2, ans)) {
                return true;
            }
        }
        return false;
    }
}