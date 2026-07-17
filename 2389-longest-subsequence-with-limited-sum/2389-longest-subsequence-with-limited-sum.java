class Solution {
    public int[] answerQueries(int[] arr, int[] queries) {
        Arrays.sort(arr);
       int n = arr.length;
       int m = queries.length;
        int[] ans = new int[m];

        for(int i = 1;i<n;i++){
            arr[i] += arr[i-1];
        }
        for(int i = 0 ; i < m ; i++){
        int low = 0 , high = n-1;
        while(low<=high){
            int mid = low + (high - low)/2; 
            if(arr[mid] > queries[i]) high = mid - 1;
            else {
                ans[i] = Math.max(ans[i],mid+1);
                low = mid+1;
            }
        }
        }


        return ans;
    }
}