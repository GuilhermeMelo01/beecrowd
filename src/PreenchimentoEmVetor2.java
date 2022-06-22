import java.util.Scanner;

public class PreenchimentoEmVetor2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t, valor=0;
        Integer[] vetor = new Integer[1000];
        t = in.nextInt();

        Integer [] valores = new Integer[t];

        for (int i = 0; i < vetor.length;) {
            for (int j = 0; j < valores.length; j++) {
                if (i <= 999){
                    vetor[i] = i;
                    valores[j] = j;
                    System.out.println("N["+vetor[i]+"]" +" = "+ valores[j]);
                    i++;
                }
            }
        }
    }
}
