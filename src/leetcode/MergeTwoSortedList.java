package leetcode;

import leetcode.listnode.ListNode;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cabeca = new ListNode();
        ListNode rabo = cabeca;
        while (list1 != null || list2 != null) {
            if (list2 == null || (list1 != null && list1.getVal() < list2.getVal())) {
                rabo.setNext(list1);
                rabo = list1;
                list1 = list1.getNext();
            } else{
                rabo.setNext(list2);
                rabo = list2;
                list2 = list2.getNext();
            }
        }
        return cabeca.getNext();
    }

    public static void main(String[] args) {
        MergeTwoSortedList mtsl = new MergeTwoSortedList();
        mtsl.mergeTwoLists(new ListNode(1, new ListNode(3, new ListNode(6))), new ListNode(2, new ListNode(4, new ListNode(5))));
    }
}
