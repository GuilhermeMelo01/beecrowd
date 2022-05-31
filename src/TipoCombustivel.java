import java.util.Scanner;

public class TipoCombustivel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;

        int tipo;

        do {
            tipo = in.nextInt();
            switch (tipo){
                case 1 :
                    alcool++;
                    break;
                case 2 :
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4 :
                    break;
            }
        }while (tipo != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Diesel: "+ diesel);
    }
}
