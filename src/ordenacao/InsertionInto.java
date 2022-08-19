package ordenacao;

public class InsertionInto {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        }

        //ORDENAÇÃO INSERTION INTO
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i]; //i: 1 = [7]
            j = i-1; // j: 0
            while(j >= 0 && vetor[j] > aux){ // [10][7][5][11] => aux: 7 | vetor[j]: 10 | [5][7][10][11]
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux; // j+1 = 1;
        }

        System.out.println("\n\n---ORDENAÇÃO INSERTION INTO---");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ " ");
        }
    }
}
