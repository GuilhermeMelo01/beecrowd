package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumberTest {
    public static boolean palidromeTest(int x){
        if (x < 0)return false;
        List<Integer> digitos = new ArrayList<>();
        while (x > 0){
            digitos.add(x % 10);
            x /= 10;
        }

        for (int i = 0, j = digitos.size()-1; i < j; i++, j--) {
            if (!digitos.get(i).equals(digitos.get(j))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palidromeTest(10101));
    }

}
