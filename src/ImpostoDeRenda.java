import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double salario, imposto = 0;

        salario = in.nextDouble();

        if (salario >= 4500.01) {
            imposto += (((salario - 4500.00) / 100) * 28);
            imposto += ((1500.00 / 100) * 18.00);
            imposto += ((1000.00 / 100) * 8.00);
            System.out.printf("R$ %.2f", imposto);
        }  if (salario >= 3000.01 && salario <= 4500.00){
            imposto += (((salario - 3000)/ 100) * 18.00);
            imposto += ((1000.00 / 100) * 8.00);
            System.out.printf("R$ %.2f", imposto);
        } if (salario >= 2000.01 && salario <= 3000 ){
            imposto += (((salario - 2000) / 100 ) * 8.00);
            System.out.printf("R$ %.2f", imposto);
        } if (salario <= 2000){
            System.out.println("Isento");
        }
    }
}


