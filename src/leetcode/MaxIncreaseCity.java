package leetcode;

public class MaxIncreaseCity {
    public static int maxIncreaseKeepingSkyline(int[][] matriz) {
        int tamanho = matriz.length;
        int[] linhaMax = new int[tamanho];
        int[] colunaMax = new int[tamanho];

        for (int l = 0; l < tamanho; ++l)
            for (int c = 0; c < tamanho; ++c) {
                linhaMax[l] = Math.max(linhaMax[l], matriz[l][c]);
                colunaMax[c] = Math.max(colunaMax[c], matriz[l][c]);
            }

        int ans = 0;
        for (int r = 0; r < tamanho; ++r)
            for (int c = 0; c < tamanho; ++c)
                ans += Math.min(linhaMax[r], colunaMax[c]) - matriz[r][c];

        return ans;
    }

    public static void main(String[] args) {
        int i = maxIncreaseKeepingSkyline(new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}});
        System.out.println(i);
    }
}
