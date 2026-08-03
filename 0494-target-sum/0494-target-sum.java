class Solution {

    public int solve(int i, int[] nums, int target) {

        if (i == nums.length) {
            if (target == 0)
                return 1;
            return 0;
        }

        int plus = solve(i + 1, nums, target - nums[i]);

        int minus = solve(i + 1, nums, target + nums[i]);

        return plus + minus;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return solve(0, nums, target);
    }
}