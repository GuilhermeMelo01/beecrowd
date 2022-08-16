package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class MultiploDe13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int x, y, soma = 0;

        x = in.nextInt();
        y = in.nextInt();

        if (x < y || x == y){
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0){
                    soma += i;
                }
            }
        } else{
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0){
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}
