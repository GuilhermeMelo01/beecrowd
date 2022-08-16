package beecrowd;

import java.util.Scanner;

public class SomaParesConsecutivos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, soma;

        while ((x = in.nextInt()) != 0) {
            soma = 0;
            if (x % 2 == 0) {
                for (int i = 0; i < 5; i++) {
                    soma += x;
                    x += 2;
                }
                System.out.println(soma);
            }else {
                x+=1;
                for (int i = 0; i < 5; i++) {
                    soma += x;
                    x += 2;
                }
                System.out.println(soma);
            }
        }
    }
}
