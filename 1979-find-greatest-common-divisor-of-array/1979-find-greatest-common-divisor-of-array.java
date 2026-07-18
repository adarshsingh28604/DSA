class Solution {
    public int gcd(int a , int b){
        if(b==0) return a;

       return gcd(b , a%b);
    
    }
    public int findGCD(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int a = arr[0] , b = arr[n-1];
       return gcd(a,b);
    }
}