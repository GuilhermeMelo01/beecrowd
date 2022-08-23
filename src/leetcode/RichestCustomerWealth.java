package leetcode;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int amount, maior = 0;
        int l = accounts.length;
        int c = accounts[0].length;


        for (int i = 0; i < l; i++) {
            amount = 0;
            for (int j = 0; j < c; j++) {
                amount += accounts[i][j];
            }
            if (amount > maior) {
                maior = amount;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[][] valor = new int[2][3];
        valor[0][0] = 1;
        valor[0][1] = 2;
        valor[0][2] = 3;
        valor[1][0] = 3;
        valor[1][1] = 2;
        valor[1][2] = 1;
        System.out.println(maximumWealth(valor));
    }
}
