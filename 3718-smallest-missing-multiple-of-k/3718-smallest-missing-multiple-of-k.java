class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
           set.add(ele);
        }
        int i = k;

        while (set.contains(i)) {
            i += k;
        }

        return i;
    }
}