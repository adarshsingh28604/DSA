// class Solution {

//     public int maze(int row, int col, int m, int n){

//         if(row == m-1 || col == n-1) return 1;

//         int rightways = maze(row, col+1, m, n);
//         int downways = maze(row+1, col, m, n);

//         return rightways + downways;
//     }

//     public int uniquePaths(int m, int n) {
//         return maze(0,0,m,n);
//     }
// }

class Solution {
    public int uniquePaths(int m, int n) {
       int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(i==0 || j==0) dp[i][j] = 1;
               else dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[m-1][n-1] ;
    }
}