class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        char[] arr = s.toCharArray();
        for(int i = 0;i<arr.length;i++){
            int a = 123-arr[i];
           sum += a*(i+1);
        }
        return sum;
    }
}