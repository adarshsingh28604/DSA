class Solution {
    public int countCommas(int n) {
        if(n<999) return 0;
        if( n==1000) return 1;
        if(n==10000 ) return 9001;
        
        return (n - 1000 ) + 1;
    }
}