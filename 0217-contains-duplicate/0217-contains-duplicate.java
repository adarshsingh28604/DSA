class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
           if(set.contains(arr[i])==false) set.add(arr[i]);
           else return true;
        }
        return false;
    }
}