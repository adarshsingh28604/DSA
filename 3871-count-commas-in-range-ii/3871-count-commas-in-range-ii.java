class Solution {
    public int digits(long n){
        int count = 0;
        while(n>0){
             n = n/10;
             count++;
        }
        return count;
    }
    public long countCommas(long n) {
       int digit =  digits(n);
       if(n<1000) return 0;
       if(digit == 4 || digit == 5 || digit == 6  ) return ((n - 1000) + 1);

       if(digit == 7 || digit == 8 || digit == 9  ) return ((n - 1000) + 1) + ((n - 1000000) + 1) ;
  
       if(digit == 10 || digit == 11 || digit == 12  ) return ((n - 1000) + 1) + ((n - 1000000) + 1)  + ((n - 1000000000L) + 1);

       if(digit == 13 || digit == 14 || digit == 15  ) return ((n - 1000) + 1) + ((n - 1000000) + 1)  + ((n - 1000000000L) + 1) + ((n -1000000000000L) + 1);

        if (digit == 16) return ((n - 1000) + 1) + ((n - 1000000) + 1) + ((n - 1000000000L) + 1) + ((n - 1000000000000L) + 1)
        + ((n - 1000000000000000L) + 1);
       return 0;
    }
}