package org.example.leetcode;

public class L138 {
    public Node copyRandomList(Node head) {
        for (Node p = head; p != null; p = p.next.next) {
            Node t = new Node(p.val);
            t.next = p.next;
            p.next = t;
        }

        for (Node p = head; p != null; p = p.next.next) {
            if(p.random!=null) {
                p.next.random = p.random.next;
            }
        }

        Node dummy = new Node(-1);
        Node cur = dummy;
        for (Node p = head;p!=null;p=p.next) {
            Node q = p.next;

            cur.next = q;
            cur = cur.next;
            p.next = q.next;

        }
        return dummy.next;
    }
}
