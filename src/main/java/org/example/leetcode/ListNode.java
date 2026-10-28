package org.example.leetcode;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode buildNode(String str) {
        String[] split = str.split(",");
        ListNode head = new ListNode();
        ListNode p = head;
        for (String s:split) {

            ListNode q = new ListNode(Integer.parseInt(s));
            p.next = q;
            p = p.next;
        }
        return head.next;
    }
}