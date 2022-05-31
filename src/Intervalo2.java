import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, x, dentro = 0, fora = 0;

        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            if (x >= 10 && x <= 20){
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}