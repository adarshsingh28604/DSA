class Solution {

    int[][] dp;
    int NEG = -(int)1e9;

    public int solve(int i, int[] nums, int target) {

        if (target == 0)
            return 0;

        if (i == nums.length)
            return NEG;

        if (dp[i][target] != -1)
            return dp[i][target];

        int skip = solve(i + 1, nums, target);

        int pick = NEG;

        if (target >= nums[i]) {
            pick = 1 + solve(i + 1, nums, target - nums[i]);
        }

        dp[i][target] = Math.max(skip, pick);

        return dp[i][target];
    }

    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        int n = nums.size();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = nums.get(i);

        dp = new int[n][target + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        int ans = solve(0, arr, target);
        return ans < 0 ? -1 : ans;
    }
}