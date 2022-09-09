package leetcode;

public class TestPalidrome {
    public static void main(String[] args) {
        boolean aabaa = palidrome("aabaa");
        System.out.println(aabaa);
    }

    public static boolean palidrome(String valor){

        for(int i= 0, j = valor.length()-1; i < j; i++, j--){
                if(valor.charAt(i) != valor.charAt(j)){
                return false;
                }
            }
        return true;
    }
}
