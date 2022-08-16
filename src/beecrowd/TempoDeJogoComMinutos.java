package beecrowd;

import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInic, minInic, horaFinal, minFinal;

        horaInic = scanner.nextInt();
        minInic = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minFinal = scanner.nextInt();

        if (horaFinal > horaInic && minFinal > minInic) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInic) + " HORA(S) E " + (minFinal - minInic) + " MINUTO(S)");
        }
        if (horaFinal > horaInic && minInic > minFinal){
            System.out.println("O JOGO DUROU " + ((horaFinal -1) - horaInic) + " HORA(S) E " +(60 -(minInic - minFinal)) + " MINUTO(S)");
        }
        if (horaInic == horaFinal || minInic == minFinal) {
            System.out.println("JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        if (horaInic > horaFinal && minInic > minFinal) {
            System.out.println("O JOGO DUROU " + (24 - (horaInic - horaFinal)) + " HORA(S) E " +
                    (60 - (minInic - minFinal)) + " MINUTO(S)");
        }
        if (horaInic > horaFinal && minFinal > minInic){
            System.out.println("O JOGO DUROU " + (24 - (horaInic - horaFinal)) + " HORA(S) E " +
                    (minFinal - minInic) + " MINUTO(S)");
        }
        scanner.close();
    }
}
