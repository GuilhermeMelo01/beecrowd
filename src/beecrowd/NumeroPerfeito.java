package beecrowd;

import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, soma;

        x = in.nextInt();

        for (int i = 1; i <= x; i++) {
            y = in.nextInt();
            soma = 0;
            for (int j = 1; j <= y - 1; j++) {
                if (y % j == 0) {
                    soma += j;
                }
            }
            if (soma == y) {
                System.out.println(y + " eh perfeito");
            } else {
                System.out.println(y + " nao eh perfeito");
            }
        }
    }
}
