package beecrowd;

import java.util.Scanner;

public class URI1589_BobConduite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cTestes = in.nextInt();
        while (cTestes > 0){
            int r1 = in.nextInt();
            int r2 = in.nextInt();

            System.out.println(r1 + r2);
            cTestes--;
        }
    }
}
