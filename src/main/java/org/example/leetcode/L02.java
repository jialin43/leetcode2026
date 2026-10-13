package org.example.leetcode;

public class L02 {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(2,l2);

        ListNode r1 = new ListNode(4);
        ListNode r2 = new ListNode(6,r1);
        ListNode r3 = new ListNode(5,r2);


        ListNode res = addTwoNumbers(l3, r3);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        int flag = 0;
        while (l1!=null || l2!=null || flag >0) {
            int curVal = (l1==null?0:l1.val)+(l2==null?0:l2.val)+flag;

            if(curVal>9) {
                curVal = curVal %10;
                flag = 1;
            }else {
                flag= 0;
            }
            ListNode newNode = new ListNode();
            newNode.val = curVal;
            cur.next = newNode;
            cur = cur.next;
            if(l1 !=null) {
                l1 = l1.next;

            }
            if(l2 !=null) {
                l2=l2.next;

            }
        }


        return head.next;
    }
}
