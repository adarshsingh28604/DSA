class Solution {
    public int singleNumber(int[] arr) {
        // int ans = 0;

        // for (int ele : arr) {
        //     ans ^= ele;
        // }

        // return ans;
        Arrays.sort(arr);
        int i = 0 , j = 1;
        if(arr.length==1) return arr[0];
        while(i<arr.length-1 && j<arr.length){
            if(arr[i]!=arr[j]) return arr[i];
            i+=2;
            j+=2;
        }
        if(i==arr.length-1) return arr[arr.length-1];
        return -1;
    }
}