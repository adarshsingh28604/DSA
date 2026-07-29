class Solution {
    public int amount(int[] arr, int i, int[] dp,int end){
         if(i>end) return 0;
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
      int take = arr[i] + amount(arr , i+2 , dp ,end);
      int skip = amount(arr,i+1,dp , end);
      return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] arr) {
           int n = arr.length;
           if(n==1) return arr[0];
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = amount(arr, 0,dp1, n - 2);


        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = amount(arr, 1,dp2, n - 1);

        return Math.max(case1, case2);
    }
}