package ordenacao;

public class BubbleSort {
    public static void main(String[] args) {
        int [] vetor = new int[20];

        System.out.println("---DESORDENADO---");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
            System.out.print(vetor[i]+ " ");
        }
        
     //   ORDENACAO BUBBLE SORT
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for(int j = i+1; j < vetor.length; j++){
                if (vetor[j] < vetor[i]){ // i:8(j) j: 10(a) | a: 10(i)
                      aux = vetor[i];
                      vetor[i] = vetor[j];
                      vetor[j] = aux;
                }
            }
        }

        System.out.println("\n\n---ORDENAÇÃO BUBBLE SORT---");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ " ");
        }



    }
}