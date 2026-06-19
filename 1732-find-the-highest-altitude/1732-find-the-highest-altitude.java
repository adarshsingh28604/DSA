class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0]=0;
        arr[1]=gain[0];
        for(int i = 2 ; i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int max = Integer.MIN_VALUE;
        for(int x : arr){
         if(x > max){
        max = x;
       }
     }
     return max;
    }
}