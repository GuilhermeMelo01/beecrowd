import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double n, val1, val2, val3, media;

        n = in.nextDouble();

        for (int i = 1; i <= n; i++) {
            val1 = in.nextDouble();
            val2 = in.nextDouble();
            val3 = in.nextDouble();
            media = ((val1*2) + (val2*3) + (val3*5)) / 10;
            System.out.printf("%.1f%n", media);
        }
    }
}
