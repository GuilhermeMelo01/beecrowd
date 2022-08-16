package beecrowd;

import java.util.Scanner;

public class ValoresPares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valores, count = 0;

        for (int i = 0; i < 5; i++) {
            valores = in.nextInt();
            if (valores % 2 == 0){
                count++;
            }
        }
        System.out.println(count + " valores pares");
    }
}
