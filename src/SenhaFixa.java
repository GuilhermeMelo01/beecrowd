import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int senha;
        senha = in.nextInt();

        while(true){
            if (senha != 2002){
                System.out.println("Senha Invalida");
                senha = in.nextInt();
            } else{
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}
