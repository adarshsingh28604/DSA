class Solution {
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int n = arr.length;
        int maxUnsatisfied = 0;
        // First window ka gain
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            if (grumpy[i] == 1)
                currSum += arr[i];
        }
        int maxSum = currSum;
        int start = 0;
        int end = k - 1;
        int i = 1;
        while (i <= n - k) {
            // Window se bahar ja raha element
            if (grumpy[i - 1] == 1)
                currSum -= arr[i - 1];
            // Window me naya element
            if (grumpy[i + k - 1] == 1)
                currSum += arr[i + k - 1];
            // Maximum gain wali window store karo
            if (currSum > maxSum) {
                maxSum = currSum;
                start = i;
                end = i + k - 1;
            }
            i++;
        }
        // Best window ko non-grumpy bana do
        for (int m = start; m <= end; m++) {
            grumpy[m] = 0;
        }

        // Final satisfied customers
        for (int j = 0; j < n; j++) {
            if (grumpy[j] == 0)
                maxUnsatisfied += arr[j];
        }
        return maxUnsatisfied;
    }
}