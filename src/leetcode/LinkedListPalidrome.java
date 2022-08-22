package leetcode;


import leetcode.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListPalidrome {
    public static boolean isPalindrome(ListNode head) {
        //1 PASSO: Guarda todos valores da listaLigada no ArrayList
        List<Integer> digitos = new ArrayList<>();
        while(head != null){
            digitos.add(head.getVal());
            head = head.getNext();
        }

        //2 PASSSO: Verificar se eles são Palidrome
        for(int i = 0, j = digitos.size()-1; i < j; i++, j--){
            if (!digitos.get(i).equals(digitos.get(j))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(new ListNode(1,
                new ListNode(3,
                new ListNode(3,
                new ListNode(1,
                        new ListNode(4))))));
    }
}
