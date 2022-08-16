package beecrowd;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;

        while(((x = in.nextInt()) != 0) && ((y = in.nextInt()) != 0)){
            if(x > 0 && y > 0){
                System.out.println("primeiro");
            } else if (x < 0 && y > 0){
                System.out.println("segundo");
            } else if (x < 0){
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }
    }
}
