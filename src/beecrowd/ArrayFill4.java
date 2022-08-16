package beecrowd;

import java.util.Scanner;

public class ArrayFill4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, count = 0, i = 0, o = 0, pos;
        Integer[] par = new Integer[5];
        Integer[] impar = new Integer[5];

        do {
            pos = 0;
            num = in.nextInt();
            count++;
            if (num % 2 == 0) {
                par[i] = num;
                i++;
                if (i == 5) {
                    i = 0;
                    for (Integer even : par) {
                        System.out.println("par[" + pos + "] = " + even);
                        par[pos] = 0;
                        pos++;
                    }
                }
            } else {
                impar[o] = num;
                o++;
                if (o == 5) {
                    o = 0;
                    for (Integer odd : impar) {
                        System.out.println("impar[" + pos + "] = " + odd);
                        impar[pos] = 0;
                        pos++;
                    }
                }
            }
        } while (count < 15);
        for (Integer odd : impar) {
            if (odd != 0) {
                System.out.println("impar[" + pos + "] = " + odd);
                pos++;
            }
        }
        pos = 0;
        for (Integer even : par) {
            if (even != 0) {
                System.out.println("par[" + pos + "] = " + even);
                pos++;
            }
        }
    }
}
