class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[] ans = new int[n];
        for(int i = 0; i<arr.length;i++){
            int first = arr[i][0];
            int last = arr[i][1];
            int seats = arr[i][2];

            ans[first-1] += seats;
        if(last<n)    ans[last+1-1] -= seats;

        }
            for(int j = 1 ; j<ans.length ; j++){
                ans[j] += ans[j-1];
            }
        return ans;
    }
}