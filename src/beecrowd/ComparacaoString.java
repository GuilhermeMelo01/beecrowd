package beecrowd;

public class ComparacaoString {
    public static void main(String[] args) {
        String[] vetor = new String[]{"Z", "B", "A" ,"F", "L"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }

        String aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j].compareTo(vetor[i]) > 0){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ " ");
        }

    }
}
