package org.example.leetcode;

public class L19 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int s = 0;
        ListNode p = head;
        while (p !=null) {
            s++;
            p=p.next;
        }
        int t= s-n;
        if(t==0) {
            return head.next;
        }
        p = head;
        for (int i=t;i>1;i--) {
            if(p.next !=null) {
                p=p.next;
            }
        }
        if(p.next!=null) {
            p.next = p.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(3,l2);
        ListNode l4 = new ListNode(2,l3);
        ListNode l5 = new ListNode(1,l4);

       removeNthFromEnd(l5,2);
    }
}
