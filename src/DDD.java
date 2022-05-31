import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ddd;
        String cidade;
        ddd = scanner.nextInt();


        cidade = switch (ddd) {
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "Sao Paulo";
            case 21 -> "Rio De Janeiro";
            case 32 -> "Juiz De Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            default -> "DDD nao cadastrado";
        };


        System.out.println(cidade);
    }
}
