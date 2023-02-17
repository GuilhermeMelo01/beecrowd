package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class URI2160_NomeFormulario {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String valor = in.nextLine();

        int tamanho = valor.length();

        if (tamanho <= 80) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
