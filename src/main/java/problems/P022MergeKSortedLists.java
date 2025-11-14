package problems;

import util.ListNode;


import java.util.PriorityQueue;

import static java.util.Comparator.*;

public class P022MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);

        PriorityQueue<ListNode> queue = new PriorityQueue<>(comparingInt(l -> l.val));

        for(ListNode list: lists) {
            if(list!=null) {
                queue.offer(list);
            }
        }

        ListNode curr = head;
        while(!queue.isEmpty()) {
            curr.next = queue.poll();
            curr = curr.next;
            if(curr.next!=null) {
                queue.offer(curr.next);
            }
        }

        return head.next;
    }
}
