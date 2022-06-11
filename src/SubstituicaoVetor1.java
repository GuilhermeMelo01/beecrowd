import java.util.Scanner;

public class SubstituicaoVetor1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer[] vetor = new Integer[10];
        int i;

        for (int j = 0; j < vetor.length; j++) {
            i = in.nextInt();
            vetor[j] = i;
            if (vetor[j] <= 0) {
                vetor[j] = 1;
            }
            System.out.println("X[" + j + "] = " + vetor[j]);
        }
    }
}
