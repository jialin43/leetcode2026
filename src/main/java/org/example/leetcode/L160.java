package org.example.leetcode;

public class L160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0, lengthB = 0;
        ListNode curr = headA;
        while (curr != null) {
            lengthA++;
            curr = curr.next;
        }
        curr = headB;
        while (curr != null) {
            lengthB++;
            curr = curr.next;
        }
        ListNode p = headA;
        ListNode q = headB;
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                p = p.next;
            }
        } else if (lengthA < lengthB) {
            for (int i = 0; i < lengthB - lengthA; i++) {
                q = q.next;
            }
        }
        while (p != null && q != null) {
            if (p !=q) {
                p = p.next;
                q = q.next;
            }else {
                return p;
            }
        }
        return null;
    }
}
