class Solution {
    ListNode head;
    Random random = new Random();

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        ListNode curr = head;
        int result = 0;
        int i = 1;

        while (curr != null) {
            if (random.nextInt(i) == 0) {
                result = curr.val;
            }
            curr = curr.next;
            i++;
        }

        return result;
    }
}