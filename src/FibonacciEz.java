import java.util.Scanner;

//        A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência,
//        cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro
//        N (N < 46) e mostre os N primeiros números dessa série.
//
//        ENTRADA
//        O arquivo de entrada contém um valor inteiro N (0 < N < 46).
//
//        SAÍDA
//        Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após
//        o último valor.

public class FibonacciEz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, sum, nextNumber = 1, previousNumber = 0;
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            if(i > 0){
                System.out.print(" ");
            }
            System.out.print(previousNumber);
            sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
