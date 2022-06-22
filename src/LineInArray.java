import java.util.Locale;
import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Double[][] matriz = new Double[12][12];
        double sum = 0.0, value;
        int n;
        char sumOrAve;

        n = in.nextInt();
        sumOrAve = in.next().charAt(0);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                value = in.nextDouble();
                matriz[i][j] = value;
                if (i == n) {
                    sum += matriz[i][j];
                }
            }
        }
        if (sumOrAve == ('S')) {
            System.out.printf("%.1f %n", sum);
        }
        if (sumOrAve == ('M')) {
            double media = sum / 144;
            System.out.printf("%.1f %n", media);
        }
    }
}
