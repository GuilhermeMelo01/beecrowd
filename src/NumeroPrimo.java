import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, x, count;

        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            count = 0;
            if (x == 1) {
                count += 3;
            } else {
                for (int j = 1; j <= x; j++) {
                    if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0 || x % 7 == 0 || x % 9 == 0) {
                        if (x != 3) {
                            if (x != 5) {
                                if (x != 7) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
            if (count > 2) {
                System.out.println(x + " nao eh primo");
            } else {
                System.out.println(x + " eh primo");
            }
        }
    }
}
