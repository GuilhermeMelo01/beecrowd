package estruturadadosealgoritimos.recursividade;

public class TorreRanoiRecursivo {
    public static void main(String[] args) {
        hanoi(3, 1,3,2);
    }

    // de um disco entre dois pinos
    private static void mover(int O, int D) {
        System.out.println(O + " -> " + D);
    }

    // Método que implementa a recursão
    // O = pino origem
    // D = pino destino
    // T = pino de trabalho
    static void hanoi(int n, int O, int D, int T) {

        if (n > 0) {
            hanoi(n - 1, O, T, D);
            mover(O, D);
            hanoi(n - 1, T, D, O);
        }

    }
}
