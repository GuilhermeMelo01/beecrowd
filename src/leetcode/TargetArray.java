package leetcode;

public class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        int posicao, valor;
        for (int i = 0; i < target.length; i++) {
            posicao = index[i];
            valor = nums[i];
            if (i != 0) {
                for (int j = target.length-1; j > posicao; j--) {
                    target[j] = target[j-1];
                }
            }
            target[posicao] = valor;
        }
        return target;
    }

    public static void main(String[] args) {
        int[] targetArray = new TargetArray().createTargetArray(new int[]{0,1,0}, new int[]{0,1,0});
        for (int i : targetArray) {
            System.out.print(i + " ");
        }
    }
}
