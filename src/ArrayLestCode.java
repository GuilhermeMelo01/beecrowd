import java.util.Scanner;

//Faca um programa para ter dados em dois vetores X[10] e Y[10]. Crie um terceiro vetor Z que tem a soma das posições
// dos vetores anteriores. Por exemplo: Posição 1 de X com a posição 1 de Y e armazene na posição 1 de Z.
// Exiba na tela de forma amigável em linha, por exemplo 1 + 1 = 2.

public class ArrayLestCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valueC, valueL;
        double[][] vetor = new double[10][10];
        double[][] repciente = new double[10][10];

        for (int c = 0; c < vetor.length; c++) {
            for (int l = 0; l < vetor.length; l++) {
                valueC = Math.random() * 100;
                valueL = Math.random() * 100;
                repciente[c][l] = valueC + valueL;
                System.out.printf("(%d)%.2f + (%d)%.2f = %.2f%n", c, valueC, l, valueL, repciente[c][l]);
            }
        }
    }
}
