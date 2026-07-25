class Solution {
    public int maxProduct(int n) {
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int siz = arr.length;
    if(siz==0) return 0;
    //  for(int i = 0 ; i<n ; i++){
    //     if(arr[i]==0)
    //  }
        int i = 0 ;
        int j = 1 ;
        int maxproduct = Integer.MIN_VALUE;
        while(j<siz){
            int a = arr[i] - '0';
            int b = arr[j] - '0';
 
            int prod = a*b;
             maxproduct = Math.max(maxproduct,prod);
            i++ ; j++;
        }
        return maxproduct;
    }
}