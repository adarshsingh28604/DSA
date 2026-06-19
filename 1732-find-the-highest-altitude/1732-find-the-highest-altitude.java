class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int max = 0;

        for(int x : gain){
            curr += x;
            max = Math.max(max, curr);
        }

        return max;
    }
}