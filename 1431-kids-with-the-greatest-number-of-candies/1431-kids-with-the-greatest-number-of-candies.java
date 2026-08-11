class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        int n = arr.length;
        int max = arr[0];
         for(int i = 0; i<n ;i++){
            max = Math.max(max,arr[i]);
         }
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        for(int ele: arr){
           if((ele + extraCandies ) >= max ) ans.add(true);
           else ans.add(false);
        }
        return ans;
    }
}