package beecrowd;

import java.util.Scanner;

public class URI2374_Pneu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int desejada = in.nextInt();
        int pressao = in.nextInt();

        System.out.println(desejada - pressao);
    }
}
