package beecrowd;

import java.util.Scanner;

public class QuadradoAoCubo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int numUm = 1;

        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + i*i + " " + (i * i) * i);
        }
    }
}
