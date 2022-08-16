package beecrowd;

public class NumberOfTraillingZeros {
    public static int zeros(int n) {
        int soma = 0;
        int anterior = 1, proximo = 2;

        for (int i = proximo; i < n+1; i++) {
            soma = anterior * proximo;
            anterior = soma;
            proximo++;
        }
        //Falta ver quantos 0 seguidos tem na soma!

        return 0;
    }

    public static void main(String[] args) {
        zeros(6);
    }
}

