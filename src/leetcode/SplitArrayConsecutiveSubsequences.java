package leetcode;

public class SplitArrayConsecutiveSubsequences {
    public static boolean isPossible(int[] nums) {
        int[] vetor = new int[nums.length];
        int tamanho = nums.length;

        while (tamanho >= 0) {
            for (int i = 0; i < nums.length; i++) {
                int proximo = i + 1;
                if (nums[i] < nums[proximo] && tamanho >= 3) {
                    vetor[i] = nums[i];
                    nums[i] = 0;
                } else {
                    return false;
                }
                tamanho--;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPossible(new int[]{1,2,3,3,4,4,5,5}));
    }
}
//[1,2,3,3,4,4,5,5]