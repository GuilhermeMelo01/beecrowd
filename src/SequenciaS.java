import java.util.Locale;

//        Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
//        S = 1 + 1/2 + 1/3 + … + 1/100
//
//        Entrada
//        Não há nenhuma entrada neste problema.

//        Saída
//        A saída contém um valor correspondente ao valor de S.
//        O valor deve ser impresso com dois dígitos após o ponto decimal.

public class SequenciaS {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double s=0;

        for (double i = 1; i <= 100; i++) {
            s = s + 1/i;
        }

        System.out.printf("%.2f%n", s);

    }
}
