package beecrowd;

import java.util.Scanner;

public class SomaImparesConsectivos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, valor = 0;

        x = in.nextInt();
        y = in.nextInt();


        if (x < y) {
            for (int i = x+1; i < y; i++) {
                if (i % 2 != 0) {
                    valor += i;
                }
            }
        } else if (y < x){
            for (int i = y+1; i < x; i++) {
                if (i % 2 != 0) {
                    valor += i;
                }
            }
        } else{
            System.out.println(valor);
        }
        System.out.println(valor);

    }
}
