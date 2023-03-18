package beecrowd;

import java.util.Scanner;

public class URI3048_SequenciaSecreta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tamanho = in.nextInt();
        int temp = 0, count = 0;
        while(tamanho > 0){
            int valor = in.nextInt();
            if((valor == 1 || valor == 2) && valor != temp){
                count++;
            }
            temp = valor;
            tamanho--;
        }

        System.out.println(count);
    }
}
