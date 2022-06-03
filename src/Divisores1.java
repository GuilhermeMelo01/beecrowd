import java.util.Scanner;

public class Divisores1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        n = in.nextInt();

        for (int i = n; i >= 0; i--) {
            if (i != 0){
                if (n % i == 0){
                    System.out.println(i); //Codigo não terminado
                }
            }
        }
    }
}
