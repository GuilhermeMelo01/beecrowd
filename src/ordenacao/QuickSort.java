package ordenacao;

public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        System.out.println("DESORDENADO");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }
        
        //QUICK SORT
        quickSort(vetor, 0, vetor.length-1);

        System.out.println("\n\nORDENADO");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    static void quickSort(int[]vetor, int inicioVetor, int finalVetor){
        if (inicioVetor < finalVetor){
            int pivo = particao(vetor, inicioVetor, finalVetor);
            quickSort(vetor, inicioVetor, pivo);
            quickSort(vetor, pivo+1, finalVetor);
        }
    }

    static int particao(int[]vetor, int inicioVetor, int finalVetor){
        int meio = (int) (inicioVetor + finalVetor) / 2;
        int pivo = vetor[meio];
        int esquerda = inicioVetor - 1;
        int direita = finalVetor + 1;
        while(true){
            do{
                esquerda++;
            }while (vetor[esquerda] < pivo);
            do{
                direita--;
            }while (vetor[direita] > pivo);
            if (esquerda >= direita){
                return direita;
            }
            int aux = vetor[esquerda];
            vetor[esquerda] = vetor[direita];
            vetor[direita] = aux;
        }
    }
}
