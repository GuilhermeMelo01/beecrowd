import java.util.Scanner;

//        Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo
//        elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.
//
//        Entrada
//        A entrada contém 20 valores inteiros, positivos ou negativos.
//
//        Saída
//        Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor
//        armazenado naquela posição.

public class TrocaEmVetor1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer[] vetor = new Integer[20];
        Integer[] pos = new Integer[20];

        int aux = 19;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
            pos[aux] = vetor[i];
            aux--;
        }
        int z = 0;
        for (Integer posicao : pos) {
            System.out.println("N["+z+"] = "+ posicao);
            z++;
        }
    }
}