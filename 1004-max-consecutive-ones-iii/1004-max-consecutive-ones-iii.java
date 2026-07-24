class Solution {
    public int longestOnes(int[] arr, int k) {
        int i = 0;
        int count = 0;
        int maxLen = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0)
                count++;
            while (count > k) {
                if (arr[i] == 0)
                    count--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}