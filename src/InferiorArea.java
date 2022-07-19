import java.util.Locale;
import java.util.Scanner;

public class InferiorArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Double [][] matriz = new Double[12][12];
        double sum = 0.0, value;
        String sumOrAve;
        int valorInit = 5;
        int valorFin = 6;

        sumOrAve = in.next();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                value = (Math.random() * 100);
                matriz[i][j] = value;
                    if (i > j && i > 6) {
                        sum += matriz[i][j];
                }
            }
        }
        if (sumOrAve.equals("S")) {
            System.out.printf("%.1f%n", sum);
        }
        if (sumOrAve.equals("M")) {
            double media = sum / 30;
            System.out.printf("%.1f%n", media);
        }
    }
}
