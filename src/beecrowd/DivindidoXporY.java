package beecrowd;

import java.util.Scanner;

    public class DivindidoXporY {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int n, x, y;

            n = in.nextInt();

            for (int i = 0; i < n; i++) {
                x = in.nextInt();
                y = in.nextInt();
                if (y == 0){
                    System.out.println("divisao impossivel");
                } else{
                    System.out.println((double) x / y);
                }
            }
        }
    }
