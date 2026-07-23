class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
    //     int n = arr.length;
    //     int minLen = Integer.MAX_VALUE;
    //    int i = 0, j = 0 , prod = 1 , count = 0;
    //    while(j<n && prod>=target) {
    //     prod *= arr[j++];
    //    }
    //    j--;

    //    while(j<n && i<n){
    //     if(prod<target) count++;
    //     prod /= arr[i];
    //     i++; j++;
    //      while(j<n && prod>=target){
    //         prod *= arr[j++];
    //      }
    //      j--;
    //    }
    //    return count;
      if (k <= 1) return 0;
        int i = 0;
        int prod = 1;
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            prod *= arr[j];
            while (prod >= k) {
                prod /= arr[i];
                i++;
            }
            count += (j - i + 1);
        }
        return count;
    }
}