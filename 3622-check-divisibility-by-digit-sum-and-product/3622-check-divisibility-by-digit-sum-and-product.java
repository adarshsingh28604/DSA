class Solution {
    public int calculation(int n ){
        int sum = 0;
        int product = 1;
        while(n>0){
            int digit = n%10;
            sum += digit;
            product*=digit;
            n = n/10;
        }
        return sum+product;
    }
    public boolean checkDivisibility(int n) {
        int ans = calculation(n);
        return (n % ans==0);
    }
}