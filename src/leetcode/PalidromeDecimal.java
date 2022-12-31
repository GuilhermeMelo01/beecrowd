package leetcode;

public class PalidromeDecimal {
    public static boolean isStrictlyPalindromic(int n) {

        for(int i = n - 2; i >= 2; i--){
            String grupo = "";
            int valor = n;
            while(valor >= i){
                int resto = valor%i;
                valor = valor / i;
                grupo = grupo.concat(String.valueOf(resto));
            }
            grupo = grupo.concat(String.valueOf(valor));

            String[] split = grupo.split("");
            for(int k = 0, j = split.length-1; k <= j; k++, j--){
                if(!split[k].equals(split[j])){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean strictlyPalindromic = isStrictlyPalindromic(4);
        System.out.println(strictlyPalindromic);
    }
}
