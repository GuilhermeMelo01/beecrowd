package recursividade;

public class SomaVetor {
    public static void main(String[] args) {
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6};

        int i = somaVetor(0, 0, vetor);
        System.out.println(i);
    }
    
    public static int somaVetor(int soma, int posicao, int[] vetor){
        if (posicao < vetor.length){
            soma = soma + vetor[posicao];
            return somaVetor(soma, posicao+1, vetor);
        }else{
            return soma;
        }
    }
}
