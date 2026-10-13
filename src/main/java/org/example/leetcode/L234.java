package org.example.leetcode;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L234 {

    public static boolean isPalindrome(ListNode head) {

      // 1. 找到中点
        ListNode half = findHalf(head);
        // 2. 反转后面的链表
        ListNode tail = reverse(half.next);

        // 3. 左右向中间判断是否是回文
        ListNode front = head;
        boolean result = true;
        while (result && tail !=null) {
            if(front.val!=tail.val) {
                result = false;
                break;
            }
            front = front.next;
            tail = tail.next;
        }
        // 4. 再转回来
        reverse(tail);
        return result;
    }

    private static ListNode findHalf(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;
      while (fast.next !=null && fast.next.next !=null) {
          fast = fast.next.next;
          slow = slow.next;
      }
      return slow;
    }

    private static ListNode reverse(ListNode head) {
      ListNode p = head;
      ListNode q = null;
      while (p!=null) {
          ListNode t = p.next;
          p.next = q;
          q = p;
          p = t;

      }
      return q;
    }

    public static void main(String[] args) {
        ListNode listNode = buildNode("1,2,2,1");
        boolean palindrome = isPalindrome(listNode);
        System.out.println(palindrome);
    }

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
