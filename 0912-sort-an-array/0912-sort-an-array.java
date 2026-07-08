class Solution {
    public int[] sortArray(int[] arr) {
        int[] ans = new int[arr.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : arr) {
        pq.offer(x);
      }

      for (int i = 0; i < arr.length; i++) {
       arr[i] = pq.poll();
       }
       return arr;
    }
}