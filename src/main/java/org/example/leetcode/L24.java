package org.example.leetcode;

import static org.example.leetcode.ListNode.buildNode;

public class L24 {
    public static ListNode swapPairs(ListNode head) {
        if(head==null) {
            return head;
        }

        ListNode dommy = new ListNode();
        dommy.next =head;
        ListNode p = dommy;
        while (p.next!=null && p.next.next!=null) {
            ListNode a = p.next;
            ListNode b = a.next;
            //0->1->2->3->0
            //p  a  b
            // 0->2-> 1->3
            p.next = b;
            a.next= b.next;
            b.next = a;
            p = a;

        }
        return dommy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = buildNode("1,2,3,4");
        ListNode listNode1 = swapPairs(listNode);
        System.out.println(listNode1);
    }
}


