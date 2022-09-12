package leetcode;

import java.util.Scanner;

public class AlphabetLetterPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Digite um numero: ");
        n = in.nextInt();

        for(int i = n-1; i >= 1; i--){
            for(int j = n-1; j >=i; j--){
                System.out.print(j);
            }
            System.out.println("");
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }


    }
}
