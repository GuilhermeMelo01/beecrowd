package estruturadadosealgoritimos.recursividade;

public class FatorialRecursivo {
    public static void main(String[] args) {
        int fatorial = fatorialRecursivo(5);
        System.out.println(fatorial);
    }

    public static int fatorialRecursivo(int i) {
        if (i <= 1) {
            return 1;
        } else {
            return i * fatorialRecursivo(i - 1);
        }
    }
}
