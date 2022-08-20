package ordenacao;

public class QuickSortTest{
    public static void main(String[] args) {
        int[] vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * 20);
        }
        quickSort(vetor, 0, vetor.length-1);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
    }
    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particao(vetor, inicio, fim);
            quickSort(vetor, inicio, pivo);
            quickSort(vetor, pivo + 1, fim);
        }
    }

    public static int particao(int[] vetor, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        int pivo = vetor[meio];
        int esquerda = inicio - 1;
        int direita = fim + 1;
        while (true) {
            do {
                esquerda++;
            } while (vetor[esquerda] < pivo);
            do {
                direita--;
            } while (vetor[direita] > pivo);
            if (esquerda >= direita) {
                return direita;
            }
            int aux = vetor[esquerda];
            vetor[esquerda] = vetor[direita];
            vetor[direita] = aux;
        }
    }
}