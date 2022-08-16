package beecrowd;

import java.util.Scanner;

public class TempoDeEvento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diasTotais = 0, horasTotais = 0, minutosTotais = 0, segundosTotais = 0;

        String [] SdiaInicial = in.nextLine().split(" ");
        String [] ShoraInicial = in.nextLine().replaceAll(" ", "").split(":");
        String [] SdiaFinal = in.nextLine().split(" ");
        String [] ShoraFinal = in.nextLine().replaceAll(" ", "").split(":");
        int diaInicial = Integer.parseInt(SdiaInicial[1]);
        int horaInicial = Integer.parseInt(ShoraInicial[0]);
        int minutoInicial = Integer.parseInt(ShoraInicial[1]);
        int segundoInicial = Integer.parseInt(ShoraInicial[2]);
        int diaFinal = Integer.parseInt(SdiaFinal[1]);
        int horaFinal = Integer.parseInt(ShoraFinal[0]);
        int minutoFinal = Integer.parseInt(ShoraFinal[1]);
        int segundoFinal = Integer.parseInt(ShoraFinal[2]);

        if (segundoInicial > segundoFinal){
            segundosTotais += (60 - segundoInicial) + segundoFinal;
            minutosTotais--;
        } else if (segundoFinal > segundoInicial){
            segundosTotais += segundoFinal - segundoInicial;
        }

        if (minutoInicial > minutoFinal){
            minutosTotais += (60 - minutoInicial) + minutoFinal;
            horasTotais--;
        } else if (minutoFinal > minutoInicial){
            minutosTotais += minutoFinal - minutoInicial;
        }

        if (horaInicial > horaFinal){
            horasTotais += (24 - horaInicial) + horaFinal;
            diasTotais--;
        } else if (horaFinal > horaInicial){
            horasTotais += horaFinal - horaInicial;
        }

        if (diaInicial > diaFinal){
            diasTotais += (30 - diaInicial) + diaFinal;
        } else if (diaFinal > diaInicial){
            diasTotais += diaFinal - diaInicial;
        }

        System.out.println(diasTotais + " dia(s)");
        System.out.println(horasTotais + " hora(s)");
        System.out.println(minutosTotais + " minuto(s)");
        System.out.println(segundosTotais + " segundo(s)");
    }
}