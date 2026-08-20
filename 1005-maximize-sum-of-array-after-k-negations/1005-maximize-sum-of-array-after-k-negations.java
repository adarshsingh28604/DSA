class Solution {
    public int largestSumAfterKNegations(int[] arr, int k) {
        Arrays.sort(arr);
        int sum = 0;
        // int sum2 = 0; 
        int i = 0;
        while(i < arr.length && arr[i]<0 && k>0){  
            arr[i]  = -1 * arr[i];
            k--;
            i++;
        }
      if(k%2!=0){
        Arrays.sort(arr);
        arr[0] *= -1;
      }

      for(int ele: arr){
        sum += ele;
      }
        return sum;
    }
}