import java.util.Locale;
import java.util.Scanner;

//        Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
//        O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade
//        média deste grupo de indivíduos.
//
//        ENTRADA
//        A entrada contém um número indeterminado de inteiros.
//        A entrada será encerrada quando um valor negativo for lido.
//
//        SAIDA
//        A saída contém um valor correspondente à média de idade dos indivíduos.
//
//        A média deve ser impressa com dois dígitos após o ponto decimal.

public class Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double idades, sum = 0, count = 0, media;

        do {
            idades = in.nextDouble();
            if (idades > 0){
                sum += idades;
                count++;
            }
        }while (idades > 0);

        media = sum / count;

        System.out.printf("%.2f%n", media);
    }
}
