package beecrowd;

import java.util.Scanner;

public class BalancoDeParentes1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String valor = in.next();

        int a = 0, f = 0;
        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) == '(') {
                a += 1;
            }
            if (valor.charAt(i) == ')') {
                f += 1;
            }
            if(f > a){
                i = valor.length();
            }
        }

        if (valor.charAt(0) == ')' || valor.charAt(valor.length() - 1) == '(' || a != f) {
            System.out.println("incorrect");
        } else {
            System.out.println("correct");
        }
    }
}
