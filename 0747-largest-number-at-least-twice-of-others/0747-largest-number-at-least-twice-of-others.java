class Solution {
    public int dominantIndex(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int idx = -1;
        for (int num = 0 ; num < n ; num++) { 
             if (arr[num] > max) { 
                secondMax = max;
                 max = arr[num]; 
                  idx = num;

                } 
             else if (arr[num] > secondMax && arr[num] != max){ 
                secondMax = arr[num]; 
                } 
            }
            if(max >=2 * secondMax) return idx;
            else return -1;

    }
}