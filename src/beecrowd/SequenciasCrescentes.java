package beecrowd;

import java.util.Scanner;

public class SequenciasCrescentes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x;

        while ((x = in.nextInt()) != 0){
            for (int i = 1; i <= x; i++) {
                if (i == x){
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
