package ordenacao;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        int [] vetor = new int[20];

        System.out.println("---DESORDENADO---");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
            System.out.print(vetor[i]+ " ");
        }
        
//        ORDENACAO BUBBLE SORT
//        int aux;
//        for (int i = 0; i < vetor.length; i++) {
//            for(int j = i+1; j < vetor.length; j++){
//                if (vetor[j] < vetor[i]){ // i:8(j) j: 10(a) | a: 10(i)
//                      aux = vetor[i];
//                      vetor[i] = vetor[j];
//                      vetor[j] = aux;
//                }
//            }
//        }
//
//        System.out.println("\n\n---ORDENAÇÃO BUBBLE SORT---");
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.print(vetor[i]+ " ");
//        }


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
