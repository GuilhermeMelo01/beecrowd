package estruturadadosealgoritimos;

import java.util.Arrays;

public class InversãoElementosVetor {

    public static void main(String[] args) {

        Integer[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int tamanho = numero.length-2;

        for (int i = 0; i < tamanho / 2; i++) {
            int temp = numero[i];
            numero[i] = numero[tamanho - i + 1];
            numero[tamanho - i + 1] = temp;
        }

        Arrays.stream(numero).forEach(System.out::print);

    }
}
