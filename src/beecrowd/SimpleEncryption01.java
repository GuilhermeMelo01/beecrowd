package beecrowd;

import java.util.Arrays;

public class SimpleEncryption01 {
    public static String encrypt(final String text, final int n) {
        String[] split = text.split("");
        String valoresImpar = "";
        String valoresPar = "";
        for (int x = 0; x < n; x++) {
            for (int i = 0; i < split.length; i++) {
                if (i % 2 != 0){
//                    valoresImpar = valoresImpar.replace(split[i]);
                }else{
                    valoresPar = valoresPar.replace(split[i], split[i]);
                }
            }
        }

        String concat = valoresImpar.concat(valoresPar);
        System.out.println();
        return null;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        return null;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("012345", 2));
    }
}
