package beecrowd;

import java.util.Scanner;

public class SequenciaLogica2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Y = in.nextInt();

        for (int i = 1; i <= (Y); i += X) {
            for (int j = i; j <= i + (X - 1); j++) {

                if (j == Y) {
                    System.out.print(j);
                } else if (j != Y && j < Y) {
                    System.out.print(j + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
