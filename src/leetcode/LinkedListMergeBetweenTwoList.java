package leetcode;

import leetcode.listnode.ListNode;

public class LinkedListMergeBetweenTwoList {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode fast = list1;
        ListNode slow = list1;

        for (int i = 0; i < a; i++) {
            slow = fast;
            fast = fast.next;
        }

        slow.next = list2;

        for (int i = a; i <= b; i++) {
            fast = fast.next;
        }

        while(slow.next != null){
            slow = slow.next;
        }

        slow.next = fast;

        return list1;
    }

    public static void main(String[] args) {
        LinkedListMergeBetweenTwoList ll = new LinkedListMergeBetweenTwoList();
        ListNode listNode = ll.mergeInBetween(new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4
                , new ListNode(5)))))), 3, 4, new ListNode(10, new ListNode(20, new ListNode(30))));
        System.out.println(listNode);
    }
}
