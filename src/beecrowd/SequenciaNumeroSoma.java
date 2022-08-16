package beecrowd;

import java.util.Scanner;

public class SequenciaNumeroSoma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m, n, soma = 0;


        while (((m = in.nextInt()) > 0) && ((n = in.nextInt()) > 0)){
            if (m < n){
                soma = 0;
                for (int i = m; i <= n; i++) {
                    soma += i;
                    System.out.print(i +" ");
                }
                System.out.println("Sum="+soma);
            }else if (m > n){
                soma = 0;
                for (int i = n; i <= m; i++) {
                    soma += i;
                    System.out.print(i +" ");
                }
                System.out.println("Sum="+soma);
            }
        }
    }
}
