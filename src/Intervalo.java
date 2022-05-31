import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valor;

        valor = scanner.nextDouble();

        if (valor < 0.00 || valor > 100.00){
            System.out.println("Fora de intervalo");
        }else if (valor >= 0.00 && valor <= 25.00){
            System.out.println("Intervalo [0,25]");
        }else if (valor >= 25.01 && valor <= 50.00){
            System.out.println("Intervalo (25,50]");
        }else if (valor >= 50.01 && valor <= 75.00){
            System.out.println("Intervalo (50,75]");
        }else if (valor >= 75.01){
            System.out.println("Intervalo (75,100]");
        }
    }
}
