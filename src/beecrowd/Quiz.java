package beecrowd;

public class Quiz {
    public static void main(String[] args) {

        int b = 3, a;
        do {
            for (a = 1; a < 6; a++) {
                a = a + 2;
                b = a * b;
            }
        } while (b < 10);

        System.out.println(a);
        System.out.println(b);
    }
}
