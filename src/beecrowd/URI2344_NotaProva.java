package beecrowd;

import java.util.Scanner;

public class URI2344_NotaProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor = in.nextInt();

        if (valor > 0 && valor <= 35){
            System.out.println("D");
        }else if(valor > 35 && valor <= 60){
            System.out.println("C");
        }else if (valor > 60 && valor <= 85){
            System.out.println("B");
        }else if(valor > 85 && valor <= 100){
            System.out.println("A");
        }else {
            System.out.println("E");
        }
    }
}
