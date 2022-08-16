package beecrowd;

import java.util.Scanner;

//        Ler um número inteiro N e calcular todos os seus divisores.
//
//        ENTRADA
//        O arquivo de entrada contém um valor inteiro.
//
//        SAÍDA
//        Escreva todos os divisores positivos de N, um valor por linha.

public class Divisores1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i != 0){
                if (n % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
