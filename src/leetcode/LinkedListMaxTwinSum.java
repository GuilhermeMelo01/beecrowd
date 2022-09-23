package leetcode;

import leetcode.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListMaxTwinSum {
    public int pairSum(ListNode head) {
        List<Integer> lista = new ArrayList<>();
        ListNode atual = head;

        while(atual != null){
            lista.add(atual.val);
            atual = atual.next;
        }

        int sum, maior=0;
        for(int i =0, j = lista.size()-1; i <= j; i++, j--){
            sum = lista.get(i) + lista.get(j);
            if(sum > maior){
                maior = sum;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        LinkedListMaxTwinSum ll = new LinkedListMaxTwinSum();
        int i = ll.pairSum(new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1)))));
        System.out.println(i);
    }
}
