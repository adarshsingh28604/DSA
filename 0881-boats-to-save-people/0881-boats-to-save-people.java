class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int i = 0;
        Arrays.sort(arr);
        int n = arr.length;
        int j = n-1;
        int count = 0;
        while(i<=j){
            if( (arr[i]+arr[j]) <= limit) {
                i++;
                j--;
             }
               else j--;
                count++;
       
        }
        return count;
    }
}