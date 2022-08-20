package leetcode;


import java.util.ArrayList;
import java.util.List;

//  Definition for singly-linked list.
class ListLinkedNode {
    int val;
    ListLinkedNode next;

    ListLinkedNode() {
    }

    ListLinkedNode(int val) {
        this.val = val;
    }

    ListLinkedNode(int val, ListLinkedNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListPalidrome {
    public static boolean isPalindrome(ListLinkedNode head) {
        //1 PASSO: Guarda todos valores da listaLigada no ArrayList
        List<Integer> digitos = new ArrayList<>();
        while(head != null){
            digitos.add(head.val);
            head = head.next;
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
        isPalindrome(new ListLinkedNode(1,
                new ListLinkedNode(3,
                new ListLinkedNode(3,
                new ListLinkedNode(1,
                        new ListLinkedNode(4))))));
    }
}
