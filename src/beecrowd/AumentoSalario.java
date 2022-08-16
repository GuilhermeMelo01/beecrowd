package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salario, reajuste = 0, novoSalario = 0;
        int percentual = 0;

        salario = scanner.nextDouble();

        if (salario > 0 && salario <= 400.00){
            reajuste = salario * 0.15;
            novoSalario = salario + reajuste;
            percentual = 15;
        } else if (salario >= 400.01 && salario <= 800.00) {
            reajuste = salario * 0.12;
            novoSalario = salario + reajuste;
            percentual = 12;
        } else if (salario >= 800.01 && salario <= 1200.00){
            reajuste = salario * 0.10;
            novoSalario = salario + reajuste;
            percentual = 10;
        } else if (salario >= 1200.01 && salario <= 2000.00){
            reajuste = salario * 0.07;
            novoSalario = salario + reajuste;
            percentual = 7;
        } else if (salario >= 2000.00){
            reajuste = salario * 0.04;
            novoSalario = salario + reajuste;
            percentual = 4;
        }

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: "+ percentual +" %");

    }
}
