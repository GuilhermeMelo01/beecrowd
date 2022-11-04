package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        int linha = arr.length;
        int coluna = arr[0].length;
        int sumDiagonalPrimaria = 0;
        int sumDiagonalSecundaria = 0;
        int x = 0, y;


        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                arr[i][j] = i;
                System.out.print("["+ i + j+"]");
            }
            System.out.println();
        }

        for (int i = 0; i <linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i == j) {
                    sumDiagonalPrimaria += arr[i][j];
                }
            }
        }

        for (int i = 0; i <linha; i++) {
            y = 0;
            for (int j = coluna - 1; j >= 0; j--) {
                if (i == j) {
                    sumDiagonalSecundaria += arr[x][y];
                }
                y++;
            }
            x++;
        }

        int valor = sumDiagonalPrimaria - sumDiagonalSecundaria;

        return Math.abs(valor);
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        int i = diagonalDifference(arr);
        System.out.println(i);
    }
}
