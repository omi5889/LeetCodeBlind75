package problems;

import util.ListNode;

public class P021MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode head = new ListNode();
        ListNode curr = head;
        while(true) {
            if(list1==null) {
                curr.next = list2;
                break;
            }
            if(list2==null) {
                curr.next = list1;
                break;
            }
            if(list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        return head.next;
    }
}
