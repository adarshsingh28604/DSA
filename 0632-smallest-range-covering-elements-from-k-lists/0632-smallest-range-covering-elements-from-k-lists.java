import java.util.*;

class Solution {
    static class Node {
        int value;
        int row;
        int index;

        Node(int value, int row, int index) {
            this.value = value;
            this.row = row;
            this.index = index;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.value - b.value);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            pq.offer(new Node(val, i, 0));
            max = Math.max(max, val);
        }

        int start = 0;
        int end = Integer.MAX_VALUE;

        while (pq.size() == nums.size()) {

            Node curr = pq.poll();
            int min = curr.value;

            if (max - min < end - start) {
                start = min;
                end = max;
            }

            if (curr.index + 1 < nums.get(curr.row).size()) {
                int nextVal = nums.get(curr.row).get(curr.index + 1);
                pq.offer(new Node(nextVal, curr.row, curr.index + 1));
                max = Math.max(max, nextVal);
            }
        }

        return new int[]{start, end};
    }
}