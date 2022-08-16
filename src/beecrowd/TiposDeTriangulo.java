package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = 0.0, b = 0.0, c = 0.0;
        double aux = 0;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (b > c){
            if (a < b){
                aux = a;
                a = b;
                b = aux;
            }
        } else if (a < c){
            aux = a;
            a = c;
            c = aux;
        }

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
