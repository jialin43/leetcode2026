package org.example.leetcode;

public class L141 {
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while(true) {
            if(fast==null || slow==null) return false;
            if(fast.val==slow.val) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
    }
}
