class Solution {
    public int[][] merge(int[][] intervals) {

        boolean[] used = new boolean[intervals.length];
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            if (used[i]) {
                continue;
            }

            int start = intervals[i][0];
            int end = intervals[i][1];
            used[i] = true;

            boolean changed = true;

            while (changed) {

                changed = false;

                for (int j = 0; j < intervals.length; j++) {

                    if (used[j]) {
                        continue;
                    }

                    // overlap check
                    if (intervals[j][0] <= end &&
                        intervals[j][1] >= start) {

                        start = Math.min(start, intervals[j][0]);
                        end = Math.max(end, intervals[j][1]);

                        used[j] = true;
                        changed = true;
                    }
                }
            }

            ans.add(new int[]{start, end});
        }

        return ans.toArray(new int[ans.size()][]);
    }
}