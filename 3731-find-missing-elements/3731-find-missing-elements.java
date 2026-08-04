class Solution {
    public List<Integer> findMissingElements(int[] arr) {
         List<Integer> ans = new ArrayList<>();
         Arrays.sort(arr);
         HashSet<Integer> set = new HashSet<>();
         for(int i = 0; i<arr.length ; i++){
            set.add(arr[i]);
         } 
         for(int i = 1; i<arr[arr.length-1] ; i++){
           if(set.contains(i)) continue;
           else if(i>arr[0] && set.contains(i)==false ) ans.add(i);
         }
         return ans;
    }
}
    