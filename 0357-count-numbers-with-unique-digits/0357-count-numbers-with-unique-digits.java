class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int limit = (int)Math.pow(10, n);
        int ans = 0;

        for (int i = 0; i < limit; i++) {
            if (unique(i)) {
                ans++;
            }
        }

        return ans;
    }

    public boolean unique(int num) {
        boolean[] seen = new boolean[10];

        while (num > 0) {
            int digit = num % 10;

            if (seen[digit]) {
                return false;
            }

            seen[digit] = true;
            num /= 10;
        }

        return true;
    }
}