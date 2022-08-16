package beecrowd;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, x;

        n = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            x = i * n;
            System.out.println(i+ " x "+ n +" = "+ x);
        }
    }
}
