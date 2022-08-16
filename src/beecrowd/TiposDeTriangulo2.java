package beecrowd;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulo2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        double [] numeros = new double[3];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
        }

        Arrays.sort(numeros);

        a = numeros[2];
        b = numeros[1];
        c = numeros[0];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (a*a > b*b + c*c) {
            System.out.println("TRIANGULO OBSTUSANGULO");
        }
        if (a*a == b*b + c*c) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (a*a < b*b + c*c) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a == b && a != c || b == c && a != c || a == c && b != c) {
            System.out.println("TRIANGULO ISOSCELES");
        }
        scanner.close();
    }
}
