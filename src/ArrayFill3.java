import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ArrayFill3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double x;
        Integer[] tamanho = new Integer[100];
        x = in.nextDouble();

        for (int i = 0; i < tamanho.length; i++) {
            tamanho[i] = i;
            System.out.printf("N[%d] = %.4f%n", i, x);
            x = x / 2;
        }
    }
}
