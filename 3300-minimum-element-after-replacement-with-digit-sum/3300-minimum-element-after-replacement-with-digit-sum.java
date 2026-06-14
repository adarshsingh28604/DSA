class Solution {
    public int sum(int n){
        int sum = 0;
        while(n>0){
         sum  += n%10;
         n=n/10;
        }
        return sum;
    }
    public int minElement(int[] arr) {

        for(int i = 0; i<arr.length; i++){
            int store = sum(arr[i]);
            arr[i]=store;
        }
        int mnm = Integer.MAX_VALUE;
         for(int i = 0; i<arr.length; i++){
             mnm = Math.min(mnm,arr[i]);
         }
         return mnm;
    }
}