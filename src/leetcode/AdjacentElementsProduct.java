package leetcode;

public class AdjacentElementsProduct {
    static int solution(int[] inputArray) {
        int maior= -100;

        for (int i = 0; i < inputArray.length-1; i++) {
            for (int j = i+1; j < i+2; j++) {
                if (inputArray[i] * inputArray[j] > maior){
                    maior = inputArray[i] * inputArray[j];
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{-23, 4, -3, 8, -12});
        System.out.println(solution);
    }

}
