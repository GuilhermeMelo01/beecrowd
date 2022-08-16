package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class VariasNotasComValidação {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double not1, not2, media;
        int x;


        do {
            double valTot = 0;
            do {
                not1 = in.nextDouble();
                if (not1 > 0.0 && not1 <= 10.0) {
                    valTot += not1;
                } else {
                    System.out.println("nota invalida");
                }
            } while (not1 < 0.0 || not1 > 10.0);

            do {
                not2 = in.nextDouble();
                if (not2 > 0.0 && not2 <= 10.0) {
                    valTot += not2;
                } else {
                    System.out.println("nota invalida");
                }
            } while (not2 < 0.0 || not2 > 10.0);

            media = valTot / 2;
            System.out.printf("media = %.2f%n", media);
            System.out.print("novo calculo (1-sim 2-nao)");
            x = in.nextInt();
            while (x != 1 && x != 2) {
                System.out.print("novo calculo (1-sim 2-nao)");
                x = in.nextInt();
            }
        } while (x != 2);
    }
}
