package estruturadadosealgoritimos.recursividade;

public class TorreRanoi {
    public static void main(String[] args) {
        hanoi(3, 3,0,0);
    }

    public static void hanoi(int n, int origem, int trabalho, int destino) {
        if (n > 0) {
            hanoi(n - 1, origem, trabalho, destino);
            hanoi(n - 1, destino, trabalho, origem);
        }
    }
}
