class Solution {
    public int countSquares(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int maxSize = Math.min(m - i, n - j);

                for (int size = 1; size <= maxSize; size++) {

                    boolean allOnes = true;

                    for (int r = i; r < i + size && allOnes; r++) {
                        for (int c = j; c < j + size; c++) {
                            if (arr[r][c] == 0) {
                                allOnes = false;
                                break;
                            }
                        }
                    }

                    if (allOnes)
                        count++;
                    else
                        break;
                }
            }
        }

        return count;
    }
}