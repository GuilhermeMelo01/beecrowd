import java.util.Scanner;

public class FubonacciEmVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long t, n, nextNumber, previousNumber, sum, ultimo=0;

        t = in.nextLong();

        for (int i = 0; i < t; i++) {
            nextNumber = 1;
            previousNumber = 0;
            sum = 0;
            n = in.nextLong();
            long[] vetor = new long[(int) n];
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = previousNumber;
                sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;
            }
            System.out.println("Fib(" + n + ") = " + previousNumber);
        }
    }
}
