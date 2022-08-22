package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> numeros = new ArrayDeque<>();

        numeros.push(1); //Adiciona o valor para a primeira posicao
        numeros.push(2);
        numeros.push(3);
        numeros.push(4);
        numeros.push(5);


        System.out.println(numeros);

        numeros.pop(); //remove e retorna o primeiro elemento da pilha

        System.out.println(numeros);

        final String OPEN_BRACKETS = "({[";
        final String CLOSING_BRACKETS = ")}]";

        char s1 = '[';
        char s2 = ']';
        OPEN_BRACKETS.indexOf(s1);
        System.out.println(OPEN_BRACKETS.indexOf(s1) == CLOSING_BRACKETS.indexOf(s2));
    }
}
