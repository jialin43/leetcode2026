package org.example.leetcode;

public class L142 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode f = head.next;
        ListNode s = head;

        while (f !=null) {
            f = f.next;
            s = s.next;
            if (f == null) {
                return null;
            }
            f = f.next;
            if (f == s) {
                s = head;
                f = f.next;
                while (s != f) {
                    s = s.next;
                    f = f.next;
                }
                return s;
            }

        }
        return null;
    }
}
