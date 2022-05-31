import java.util.Scanner;

public class SomaDeImparesConsecutivos2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, x, y, soma = 0;
 
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            soma = 0;
            if (x < y){
                for (int j = x+1; j < y; j++) {
                    if (j%2 != 0){
                        soma += j;
                    }
                }
            } else {
                for (int j = y+1; j < x; j++) {
                    if (j%2 != 0){
                        soma += j;
                    }
                }
            }
            System.out.println(soma);
        }
    }
}
