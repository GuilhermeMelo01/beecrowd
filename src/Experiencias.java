import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int n, quantia;
        double totCoelhos = 0.0, totRatos = 0.0, totSapos = 0.0, totCobaias = 0.0, pctCoelho, pctSapos, pctRatos;
        String tipo;

        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            quantia = in.nextInt();
            tipo = in.next();
            if (tipo.equals("R")) {
                totRatos += quantia;
                totCobaias += quantia;
            } else if (tipo.equals("S")) {
                totSapos += quantia;
                totCobaias += quantia;
            } else if (tipo.equals("C")) {
                totCoelhos += quantia;
                totCobaias += quantia;
            }
        }

        pctCoelho =  (totCoelhos / totCobaias) * 100.0;
        pctRatos =  (totRatos / totCobaias) * 100.0;
        pctSapos =  (totSapos / totCobaias) * 100.0;


        System.out.printf("Total: %.0f cobaias%n", totCobaias);
        System.out.printf("Total de coelhos: %.0f%n", totCoelhos);
        System.out.printf("Total de ratos: %.0f%n", totRatos);
        System.out.printf("Total de sapos: %.0f%n", totSapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", pctCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", pctRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", pctSapos);
    }
}
