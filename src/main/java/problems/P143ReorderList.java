package problems;

import util.ListNode;

public class P143ReorderList {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) {
            return;
        }

        ListNode obj = new ListNode();
        System.out.println(obj.getNodeValueList(head));

        ListNode h1 = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        System.out.println(slow.val);

        ListNode h2 = reverseList(slow.next);
        slow.next = null;
        System.out.println(obj.getNodeValueList(h1));
        System.out.println(obj.getNodeValueList(h2));

        ListNode h3 = new ListNode(0);
        ListNode h4 = h3;
        while(h1!=null || h2!=null) {
            if(h1!=null) {
                h3.next = h1;
                h1 = h1.next;
                h3 = h3.next;
            }
            if(h2!=null) {
                h3.next = h2;
                h2 = h2.next;
                h3 = h3.next;
            }

        }
        System.out.println(obj.getNodeValueList(h4.next));




    }

    private ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        P143ReorderList pobj = new P143ReorderList();
        ListNode obj = new ListNode();
        pobj.reorderList(obj.getList(new int[]{1,2,3,4,5}));
    }
}
