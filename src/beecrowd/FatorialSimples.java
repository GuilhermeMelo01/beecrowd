package beecrowd;

import java.util.Scanner;

//        Ler um valor N. Calcular e escrever seu respectivo fatorial.
//        Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//
//        ENTRADA
//        beecrowd.A entrada contém um valor inteiro N (0 < N < 13).
//
//        SAIDA
//        beecrowd.A saída contém um valor inteiro, correspondente ao fatorial de N.

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;
        int sum = 1;

        number = in.nextInt();

        for (int i = number; i > 0; i--) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
