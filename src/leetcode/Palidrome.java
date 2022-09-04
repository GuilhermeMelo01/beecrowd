package leetcode;

public class Palidrome {
    static boolean solution(String inputString) { //aabaa = palidrome
        int length = inputString.length()-1;
        for (int i = 0, j = length; i < j; i++, j--) {
            if(inputString.charAt(i) != inputString.charAt(j)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        boolean aabaa = solution("aabaab");
        System.out.println(aabaa);
    }

}
