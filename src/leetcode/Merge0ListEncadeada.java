package leetcode;

import leetcode.listnode.ListNode;

public class Merge0ListEncadeada {
    public static ListNode mergeNodes(ListNode head) {
        ListNode receptor = new ListNode();
        ListNode list = receptor;
        ListNode atual = head;
        atual = atual.getNext();
        int sum = 0;
        while (atual != null) {
            if (atual.getVal() != 0) {
                sum += atual.getVal();
            }else{
                list.setNext(new ListNode(sum));
                list = list.getNext();
                sum = 0;
            }
            atual = atual.getNext();
        }
        return receptor.getNext();
    }

    /*   rabo.setNext(list1);
                rabo = list1;
                list1 = list1.getNext();*/
    public static void main(String[] args) {
        ListNode listNode = mergeNodes(new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0,
                new ListNode(4, new ListNode(5, new ListNode(0))))))));
        System.out.println(listNode);
    }
}
