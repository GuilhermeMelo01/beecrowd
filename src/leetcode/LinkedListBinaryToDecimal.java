package leetcode;

import leetcode.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListBinaryToDecimal {
    public int getDecimalValue(ListNode head) {
        List<Integer> lista = new ArrayList<>();
        ListNode nova = head;

        while(nova != null){
            lista.add(nova.getVal());
            nova = nova.getNext();
        }

        int sum=0;
        int j=0;
        for(int i= lista.size()-1; i >= 0; i--, j++){
            sum += (int) (lista.get(i) * (Math.pow(2, j)));
        }
        return sum;
    }

    public static void main(String[] args) {
        LinkedListBinaryToDecimal ll = new LinkedListBinaryToDecimal();
        int decimalValue = ll.getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1))));
        System.out.println(decimalValue);
    }
}
