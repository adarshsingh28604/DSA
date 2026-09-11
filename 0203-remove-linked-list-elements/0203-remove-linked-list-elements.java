
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode temp = head;

        prev.next = temp;

        while(temp!=null ){
           
          if(temp.val == val) prev.next = temp.next;
          else prev = prev.next;
          temp = temp.next;
        //   prev = prev.next;
        }
        return dummy.next;
    }
}