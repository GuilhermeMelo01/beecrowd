package ordenacao;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        System.out.println("DESORDENADO");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }

        int menor_posicao;
        for (int i = 0; i < vetor.length; i++) {
            menor_posicao = i;
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor_posicao]){
                    menor_posicao = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[menor_posicao];
            vetor[menor_posicao] = aux;
        }

        System.out.println("\nORDENADO");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }


    }
}
