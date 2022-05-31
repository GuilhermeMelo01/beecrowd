import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double nota, soma = 0, media = 0, z = 0;

        while (true) {
            nota = in.nextDouble();
            if (nota > 0 && nota < 10.1) {
                z = z + 1;
                soma += nota;
                if (z == 2) {
                    media = soma / 2;
                    System.out.println("media = "+ media);
                    break;
                }
            } else if (nota < 0) {
                System.out.println("nota invalida");
            } else if (nota > 10) {
                System.out.println("nota invalida");
            }
        }
    }
}
