import java.util.Scanner;

public class SomandoIntConsecutivos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, n, soma = 0;

        a = in.nextInt();
        do {
            n = in.nextInt();
        } while (n <= 0);

        for (int i = 0; i <= n - 1; i++) {
            soma += a + i;
        }
        System.out.println(soma);
    }
}
