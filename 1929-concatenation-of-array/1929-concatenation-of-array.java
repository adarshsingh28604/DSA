class Solution {
    public int[] getConcatenation(int[] arr) {
      int n = arr.length;
        int[] ans = new int[n*2];
        int i = 0;
        while(i<n){
           ans[i] = arr[i];
           ans[i+n] = arr[i];
           i++;
        }
        return ans;
    }
}