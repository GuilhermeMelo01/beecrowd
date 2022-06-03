import java.util.Locale;

public class SequenciaS2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double s = 1;

        for (double i = 1; i < 100; i++) {
                s = s + 1; //Codigo não terminado
        }

        System.out.printf("%.2f%n", s);

    }
}
