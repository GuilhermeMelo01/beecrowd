import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//
//        Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um
//        valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
//
//        Entrada
//        A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.
//
//        Saída
//        Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o
//        valor armazenado na posição, com uma casa após o ponto decimal.

public class SelecaoEmVetor1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner in = new Scanner(System.in);

        double[] vetor = new double[100];

        for (int i = 0; i < 100; i++) {
            vetor[i] = in.nextDouble();
            if (vetor[i] <= 10){
                System.out.println("A["+i+"] = "+ df.format(vetor[i]));
            }
        }
    }
}
