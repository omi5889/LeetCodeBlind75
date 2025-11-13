package problems;

import util.ListNode;

public class P019RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode slow = head;
        ListNode current = head;
        int count = n;
        while(current!=null) {
            if(count < 0) {
                slow = slow.next;
            }
            count--;
            current = current.next;
        }
        if(count>0) return null;
        if(count==0) return head.next;
        slow.next = slow.next.next;
        return head;

    }
}
