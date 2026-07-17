class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] temp = nums.clone();
            Arrays.sort(temp);

            int sum = 0;
            int count = 0;

            for (int x : temp) {
                if (sum + x <= queries[i]) {
                    sum += x;
                    count++;
                } else {
                    break;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}