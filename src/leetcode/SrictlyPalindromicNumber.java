package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SrictlyPalindromicNumber {
    public boolean isStrictlyPalindromic(int n) {
        List<Integer> lista = new ArrayList<>();
        while (n >= 1) {
            int resto = n % 2;
            n /= 2;
            lista.add(resto);
        }

        int[] binario = new int[lista.size()];
        int tamanho = binario.length-1;
        for (int i = 0; i < binario.length; i++) {
            binario[tamanho] = lista.get(i);
            tamanho--;
        }

        for(int i=0, j=binario.length-1; i < j; i++, j--){
            if(binario[i] != binario[j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean strictlyPalindromic = new SrictlyPalindromicNumber().isStrictlyPalindromic(4);
        System.out.println(strictlyPalindromic);
    }
}
