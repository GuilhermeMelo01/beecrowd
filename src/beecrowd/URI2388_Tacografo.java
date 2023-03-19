package beecrowd;

import java.util.Scanner;

public class URI2388_Tacografo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int intervalo = in.nextInt();
        int valorTotal = 0;

        while(intervalo > 0){
            int tempo = in.nextInt();
            int distancia = in.nextInt();
            valorTotal += (tempo * distancia);
            intervalo--;
        }

        System.out.println(valorTotal);
    }
}
