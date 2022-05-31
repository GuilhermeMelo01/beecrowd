import java.util.Scanner;

public class ValoresImparesApartiNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        numero = in.nextInt();

        for (int i = numero; i <= numero+11; i++) {
                if(i % 2 == 1){
                    System.out.println(i);
                }
        }
    }
}
