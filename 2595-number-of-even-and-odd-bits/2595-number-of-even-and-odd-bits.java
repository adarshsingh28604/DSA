class Solution {
    public int[] evenOddBit(int n) {
        List<Integer> ans = new ArrayList<>();
        while(n!=1){
           int m =  n%2;
           ans.add(m);
           n = n/2;
        }
        ans.add(1);
     StringBuilder sb = new StringBuilder();

      for (int x : ans) {
      sb.append(x);
     }

     String s = sb.toString();
        int m = s.length();
        int ec = 0;
        int oc = 0;
   for(int i = 0; i < m; i += 2) {
    if(s.charAt(i) == '1')
        ec++;
}

for(int i = 1; i < m; i += 2) {
    if(s.charAt(i) == '1')
        oc++;
}
        int[] finalans = {ec,oc};
        return finalans;
    }
}