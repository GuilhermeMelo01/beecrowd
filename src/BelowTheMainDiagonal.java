import java.util.Locale;
import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Double[][] matriz = new Double[12][12];
        double sum = 0.0, value;
        String sumOrAve;
        sumOrAve = in.next();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                value = in.nextDouble();
                matriz[i][j] = value;
                if (i > j) {
                    sum += matriz[i][j];
                }
            }
        }
        if (sumOrAve.equals("S")) {
            System.out.printf("%.1f%n", sum);
        }
        if (sumOrAve.equals("M")) {
            double media = sum / 66;
            System.out.printf("%.1f%n", media);
        }
    }
}
