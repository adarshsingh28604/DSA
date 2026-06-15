class Solution {
    public int minimumDifference(int[] arr, int k) {
        Arrays.sort(arr);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int min = arr[i];
            int max = arr[i + k - 1];

            ans.add(max - min);
        }

        Collections.sort(ans);
        return ans.get(0);
    }
}