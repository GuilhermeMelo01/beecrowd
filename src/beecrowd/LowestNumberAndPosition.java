package beecrowd;

import java.util.Scanner;

public class LowestNumberAndPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, x, pos = 0;
        long small = 4208293401855242342L;

        n = in.nextInt();

        Integer[] array = new Integer[n];

        for (int i = 0; i < array.length; i++) {
            x = in.nextInt();
            array[i] = x;
            if (x < small) {
                small = x;
                pos = i;
            }
        }
        System.out.println("Menor valor: " + small);
        System.out.println("Posicao: " + pos);

    }
}
