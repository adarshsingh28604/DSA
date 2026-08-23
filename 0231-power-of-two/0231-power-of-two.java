class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0 /*|| n%2!=0 */) return false;
        return ((n & (n-1))==0);
    }
}