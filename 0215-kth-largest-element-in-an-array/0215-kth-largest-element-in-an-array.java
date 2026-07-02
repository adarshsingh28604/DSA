class Solution {
    public int findKthLargest(int[] arr, int k) {
        // int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele: arr){
          pq.add(ele);
          if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}