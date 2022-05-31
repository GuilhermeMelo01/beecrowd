import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior = 0, x, pos = 0;

        for (int i = 1; i <= 100; i++) {
            x = in.nextInt();
            if(x > maior){
                maior = x;
                pos = i;
            }
        }
        System.out.println(maior);
        System.out.println(pos);
    }
}
