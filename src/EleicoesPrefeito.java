import java.util.Scanner;

public class EleicoesPrefeito {
    public static void main(String[] main) {
        Scanner in = new Scanner(System.in);

        long quantEleitores;
        int votoCandidato1 = 0, votoCandidato2 = 0, votoCandidato3 = 0, voto;

        quantEleitores = in.nextLong();

        for (long i = quantEleitores; i > 0; i--) {
            System.out.print("Digite um numero do candito 1, 2 ou 3 : ");
            voto = in.nextInt(4);
            switch (voto) {
                case 1 -> votoCandidato1 += 1;
                case 2 -> votoCandidato2 += 1;
                case 3 -> votoCandidato3 += 1;
            }
        }

        if ((50 * quantEleitores / 100) < votoCandidato1) {
            System.out.println("Candidato 1 eleito no primeiro turno!");
        } else if ((50 * quantEleitores / 100) < votoCandidato2) {
            System.out.println("Candidato 2 eleito no primeiro turno!");
        } else if ((50 * quantEleitores / 100) < votoCandidato3) {
            System.out.println("Candidato 3 eleito no primeiro turno!");
        } else {
            System.out.println("Teremos segundo turno!");
        }


    }
}