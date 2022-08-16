package beecrowd;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int um = 1, dois = 2, tres =3;

        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(um + " " + dois + " " + tres + " beecrowd.PUM");
            um+=4;
            dois+=4;
            tres+=4;
        }
    }
}
