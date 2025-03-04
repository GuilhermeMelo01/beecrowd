package beecrowd;

import java.util.Scanner;

//  Leia a hora inicial e a hora final de um jogo. beecrowd.A seguir calcule a duração do jogo, sabendo que o mesmo
//  pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//
//        Entrada
//        beecrowd.A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
//
//        Saída
//        Apresente a duração do jogo conforme exemplo abaixo.

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial, horaFinal;

        horaInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();

        if (horaInicial > horaFinal) {
            System.out.println("O JOGO DUROU " + (24 - (horaInicial - horaFinal)) + " HORA(S)");
        } else if (horaFinal > horaInicial) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
