class Solution {
    public double myPow(double x, int n) {
      int s = n;
    
      long m = Math.abs((long)n);
       double ans = 1;
     while (m > 0) {
            if (m % 2 == 1) {
                ans *= x;
            }

            x *= x;
            m /= 2;
        }
      if(s<0){
        return 1/ans;
      }
      return ans;
    }
}