package ordenacao;

public class TestOrdenacao {
    public static void main(String[] args) {
        int[] vetor = new int[100000];

//        System.out.println("DESORDENADO");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
//            System.out.print(vetor[i] + " ");
        }

        //SELECTION SORT
        long tempoInicial, tempoFinal;
        tempoInicial = System.currentTimeMillis();
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
        tempoFinal = System.currentTimeMillis();
        System.out.println("TEMPO SELECTION SORT - "+ (tempoFinal - tempoInicial));


        //HEAP SORT
        tempoInicial = System.currentTimeMillis();
        int tamanho = vetor.length;
        for(int i = tamanho / 2 - 1; i >= 0; i--){
            aplicarHeap(vetor, tamanho, i);
        }

        for (int j = tamanho-1; j > 0; j--){
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;
            aplicarHeap(vetor, j, 0);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("TEMPO HEAP SORT - "+ (tempoFinal - tempoInicial));

//        System.out.println("\nORDENADO");
//        for (Integer v: vetor){
//            System.out.print(v+" ");
//        }

    }

    private static void aplicarHeap(int[] vetor, int tamanho, int i) {
        int raiz = i;
        int esquerda = 2*i+1;
        int direita = 2*i+2;

        if(esquerda < tamanho && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        if(direita < tamanho && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }

        if (raiz != i){
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            aplicarHeap(vetor, tamanho, raiz);
        }
    }
}
