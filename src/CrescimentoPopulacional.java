import java.util.Locale;
import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int t;
        int pa, pb, ano;
        double g1, g2, crescimentoA, crescimentoB;

        t = in.nextInt();

        for (int i = 0; i < t; i++) {
            pa = in.nextInt();
            pb = in.nextInt();
            g1 = in.nextDouble();
            g2 = in.nextDouble();
            ano = 0;
            while (pa <= pb){
                crescimentoA = Math.abs((g1 / 100) * pa);
                crescimentoB = Math.abs((g2 / 100) * pb);
                pa += crescimentoA;
                pb += crescimentoB;

                ano += 1;
                if(ano > 100){
                    break;
                }
            }
            if (ano > 100){
                System.out.println("Mais de 1 seculo.");
            }else {
                System.out.println(ano + " anos.");
            }
        }
    }
}
