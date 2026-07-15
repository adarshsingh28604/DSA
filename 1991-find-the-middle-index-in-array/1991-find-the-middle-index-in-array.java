 class Solution {
    public int findMiddleIndex(int[] arr) {
        int n = arr.length;
        
      
       for(int i =1; i< n ; i++){
        arr[i]+=arr[i-1];
       }
       for(int j = 0;j<n;j++){
           int leftsum = 0;
         if(j>0) leftsum = arr[j-1];
        int rightsum = arr[n-1]-arr[j];
         if(leftsum==rightsum) return j;
       }
       return -1;
    }
}
