package leetcode;

public class ShuffledString {
    public String restoreString(String s, int[] indices) {
        char[] letras = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            letras[indices[i]] = s.charAt(i);
        }
        return String.valueOf(letras);
    }

    public static void main(String[] args) {
        String codeleet = new ShuffledString().restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println(codeleet);
    }
}
