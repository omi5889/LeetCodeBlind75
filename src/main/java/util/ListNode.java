package util;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode() {}

    /*
     * creates a new linked from provided array with first element as head
     * input: int array like [6,2,7,9]
     * output: ListNode head 6
     * */
    public ListNode getList(int[] arr) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int j : arr) {
            curr.next = new ListNode(j);
            curr = curr.next;
        }
        return head.next;
    }

    public void dispList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head!=null) {
            sb.append(head.val);
            sb.append(" ");
            head = head.next;
        }
        System.out.print(sb.toString());
    }

    public List<Integer> getNodeValueList(ListNode head) {
        List<Integer> res = new ArrayList<>();
        while(head!=null) {
            res.add(head.val);
            head = head.next;
        }
        return res;
    }
}
