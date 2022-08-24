package leetcode;

public class MinimumSumFourDigitNumber {
    public static int minimumSum(int num) {
        String numString = String.valueOf(num);
        String[] split = numString.split("");
        for (int i = 0; i < split.length; i++) {
            for (int j = i+1; j < split.length; j++) {
                if (split[j].compareTo(split[i]) < 0){
                    String aux = split[i];
                    split[i] = split[j];
                    split[j] = aux;
                }
            }
        }
        Integer new1 = Integer.parseInt(split[0] + split[2]);
        Integer new2 = Integer.parseInt(split[1] + split[3]);
        return new1 + new2;
    }

    public static void main(String[] args) {
        minimumSum(2932);
    }
}
