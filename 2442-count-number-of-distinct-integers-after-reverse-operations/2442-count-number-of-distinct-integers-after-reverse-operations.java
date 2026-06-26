class Solution {
    public int digits(int n){
        int rev= 0;
        while(n>0){
            int digit = n%10;
            rev = rev * 10 + digit; 
            n = n/10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] arr) {
       ArrayList<Integer> ans = new ArrayList<>();
         for (int x : arr) ans.add(x);
        int n = ans.size();
        for(int i = 0;i<n;i++){
           ans.add(digits(ans.get(i)));
        }
        HashSet<Integer> list = new HashSet<>();
         for(int i = 0;i<ans.size();i++){
            list.add(ans.get(i));
         }
       return list.size();
    }
}