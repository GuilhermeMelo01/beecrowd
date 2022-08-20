package leetcode;


//Definition for singly-linked list
public class    ListNode {
    int val;
    ListLinkedNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListLinkedNode next) { this.val = val; this.next = next; }
}

class Solution {
    // Add Two Numbers (Java improved)
    public static ListLinkedNode addTwoNumbers(ListLinkedNode l1, ListLinkedNode l2) {
        ListLinkedNode dummyHead = new ListLinkedNode(0);
        ListLinkedNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListLinkedNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        addTwoNumbers(new ListLinkedNode(2, new ListLinkedNode(4, new ListLinkedNode(3))),
                new ListLinkedNode(5, new ListLinkedNode(6, new ListLinkedNode(4))));
    }
}
