package beecrowd;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, x;

        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            if(x > 0 && x % 2 == 0){
                System.out.println("EVEN POSITIVE");
            }else if(x > 0) {
                System.out.println("ODD POSITIVE");
            } else if(x < 0 && x % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if(x < 0){
                System.out.println("ODD NEGATIVE");
            }
            else{
                System.out.println("NULL");
            }
        }
    }
}
