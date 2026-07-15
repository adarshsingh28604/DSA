class Solution {
    public long[] findPrefixScore(int[] arr) {
        int n = arr.length;
        long[] arr1 = new long[n];
        long[] arr2 = new long[n];
       
         long max = Long.MIN_VALUE;
        for(int i = 0; i<n ;i++){
            max = Math.max((long) arr[i],max);
            arr1[i]=(long) arr[i] + max;
        }
       arr2[0]=arr1[0];
       for(int i = 1 ;i<n;i++){
        arr2[i] = arr2[i-1]+arr1[i];
       }
       return arr2;
    }
}