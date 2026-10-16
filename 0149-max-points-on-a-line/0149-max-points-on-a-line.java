import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2) return n;

        int ans = 0;

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            int duplicate = 0;
            int max = 0;

            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0 && dy == 0) {
                    duplicate++;
                    continue;
                }

                int g = gcd(Math.abs(dx), Math.abs(dy));

                dx /= g;
                dy /= g;

                if (dx < 0 || (dx == 0 && dy < 0)) {
                    dx = -dx;
                    dy = -dy;
                }

                String slope = dx + "," + dy;

                int count = map.getOrDefault(slope, 0) + 1;
                map.put(slope, count);

                max = Math.max(max, count);
            }

            ans = Math.max(ans, max + duplicate + 1);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}