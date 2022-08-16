package beecrowd;

public class VerificarArray{

    static int EstaOrdemCrescente(int vetor[]) {
//        if(vetor.length == 0) return 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i - 1] > vetor[i]) {
                System.out.println("decrescente");
                return 0;
            }
        }
//        System.out.println("crescente");
        if (vetor.length >= 1 && vetor.length <= 1.00000000) {

        }
        return 0;
    }
        public static void main(String[] args) {
            EstaOrdemCrescente(new int []{1, 2, 3, 4});
        }

}
