class Solution {
    public int longestArithmetic(int[] nums) {
        int n = nums.length;
        int[] d = new int[n];

        for (int i = 1; i < n; i++) {
            d[i] = nums[i] - nums[i - 1];
        }

        int[] left = new int[n];
        int[] right = new int[n];

        java.util.Arrays.fill(left, 2);
        java.util.Arrays.fill(right, 2);

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 2; i < n; i++) {
            if (d[i] == d[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        for (int i = n - 3; i >= 0; i--) {
            if (d[i + 1] == d[i + 2]) {
                right[i] = right[i + 1] + 1;
            }
        }

        int ans = 3;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, Math.max(left[i], right[i]));

            if (i > 0) {
                ans = Math.max(ans, left[i - 1] + 1);
            }

            if (i + 1 < n) {
                ans = Math.max(ans, right[i + 1] + 1);
            }

            if (i > 0 && i < n - 1) {
                int diff = nums[i + 1] - nums[i - 1];

                if (diff % 2 == 0) {
                    diff /= 2;

                    int len = 3;

                    if (i > 1 && diff == d[i - 1]) {
                        len += left[i - 1] - 1;
                    }

                    if (i < n - 2 && diff == d[i + 2]) {
                        len += right[i + 1] - 1;
                    }

                    ans = Math.max(ans, len);
                }
            }
        }

        return ans;
    }
}