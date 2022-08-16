package beecrowd;

import java.util.Scanner;

public class SomaImparesConsecutivos3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, x, y, soma;

        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            do {
                if (x % 2 != 0){
                    soma=0;
                    while(y > 0){
                        soma += x;
                        x+=2;
                        y--;
                    }
                    System.out.println(soma);
                    break;
                }else {
                    x+=1;
                    soma=0;
                    while(y > 0){
                        soma += x;
                        x+=2;
                        y--;
                    }
                    System.out.println(soma);
                    break;
                }
            }while (true);
        }
    }
}
