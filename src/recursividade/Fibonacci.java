package recursividade;

public class Fibonacci {
    public static void main(String[] args) {
    /*    int valor = 7;
        int anterior = 0, proximo = 1;
        while (valor >= 0) {
            System.out.println(anterior);
            int aux = proximo + anterior;
            anterior = proximo;
            proximo = aux;
            valor--;
        }*/

        int fibonacci = getFibonacci(6);
        System.out.println(fibonacci);

    }

    public static int getFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
