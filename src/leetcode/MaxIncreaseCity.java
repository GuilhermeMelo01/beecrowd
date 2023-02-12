package leetcode;

public class MaxIncreaseCity {
    public static int maxIncreaseKeepingSkyline(int[][] matriz) {
        int length = matriz.length;
        int[] rowMax = new int[length];
        int[] colMax = new int[length];

        for(int r = 0; r < rowMax.length; r++){
            for(int c = 0; c < colMax.length; c++){
                rowMax[r] = Math.max(rowMax[r], matriz[r][c]);
                colMax[c] = Math.max(colMax[c], matriz[r][c]);
            }
        }

        int ans = 0;
        for(int r = 0; r < rowMax.length; r++){
            for(int c = 0; c < colMax.length; c++){
                ans += Math.min(rowMax[r], colMax[c]) - matriz[r][c];
            }
        }
     return ans;
    }
    public static void main(String[] args) {
        int i = maxIncreaseKeepingSkyline(new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}});
        System.out.println(i);
    }
}
