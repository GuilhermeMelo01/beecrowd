import java.util.Scanner;

public class ValoresImparesEntreNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        numero = in.nextInt();


        for (int i = 1; i <= numero; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
