class Solution {
    public int lastStoneWeight(int[] arr) {
        // ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int x : arr){
        pq.offer(x);
        // ans.add(x);
      }
    while(pq.size()>1){ 
         int y = pq.remove();
         int x = pq.remove();
         if(x != y) {
             pq.add(y-x);
         }
    
      }
      if(pq.size()==0) return 0;
      int finalans = pq.remove();
      return finalans;
    }
}