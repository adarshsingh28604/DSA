class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
                 int count = 0;
                 int avg = 0;

      
                int sum  = 0;
                  for(int i = 0;i<k;i++){
                 sum  += arr[i];
                 avg = sum/k;
            }
            if(avg >= threshold) count++;
        int i = 1 , j = i+k-1;

        while(j<n){
          sum = sum - (arr[i-1]) + (arr[j]);
          if(sum >= threshold*k) count++;
          i++;
          j++;
        }
        return count;
    }
}