class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
              List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr , (a , b)-> Integer.compare(a[0], b[0]));
        for(int[] point : arr){
            if(ans.size()==0|| ans.get(ans.size()-1)[1] <= point[0]){
                ans.add(point);
               } else{
                    int start = Math.max(ans.get(ans.size()-1)[0] , point[0]);
                    int end = Math.min(ans.get(ans.size()-1)[1] , point[1]);
                    int[] intervals = { start , end };
                    ans.set(ans.size()-1 , intervals);
                }
            }
        return arr.length - ans.size();
    }
}