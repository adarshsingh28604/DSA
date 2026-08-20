class Solution {
    public int maximumUnits(int[][] arr, int trucksize) {
        Arrays.sort(arr,(a,b)->Integer.compare(b[1] , a[1]));
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int nb = arr[i][0];
            int un = arr[i][1];

           int min =  Math.min(nb,trucksize);
           trucksize -= min;
           sum += un*min;
           if(trucksize == 0 ) return sum;
        }
        return sum;
    }
}