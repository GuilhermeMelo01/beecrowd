package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> numeros = new ArrayDeque<>();

        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        numeros.push(4);
        numeros.push(5);

        System.out.println(numeros);

        numeros.pop(); //remove e retorna o primeiro elemento da pilha

        System.out.println(numeros);
    }
}
