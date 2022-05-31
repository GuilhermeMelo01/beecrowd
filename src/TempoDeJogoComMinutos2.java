import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogoComMinutos2  {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int horaInic, minInic, horaFinal, minFinal, hora_total, minuto_total;

        horaInic = scanner.nextInt();
        minInic = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minFinal = scanner.nextInt();

        hora_total = horaFinal - horaInic;

        if (hora_total < 0){
            hora_total = 24 + (horaFinal - horaInic);
        }

        minuto_total = minFinal - minInic;

        if (minuto_total < 0){
            minuto_total = 60 + (minFinal - minInic);
            hora_total--;
        }

        if (horaInic == horaFinal && minInic == minFinal){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else{
            System.out.println("O JOGO DUROU "+ hora_total + " HORA(S) E "+ minuto_total +" MINUTO(S)");
        }

        scanner.close();
    }
}