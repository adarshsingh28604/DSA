class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        for (int[] interval : intervals) {

            if (ans.isEmpty() ||
                ans.get(ans.size() - 1)[1] < interval[0]) {

                ans.add(interval);

            } else {

                int[] newInterval = new int[2];

                newInterval[0] = ans.get(ans.size() - 1)[0];

                newInterval[1] =
                    Math.max(ans.get(ans.size() - 1)[1], interval[1]);

                ans.set(ans.size() - 1, newInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}