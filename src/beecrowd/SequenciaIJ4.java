package beecrowd;

import java.util.Locale;

public class SequenciaIJ4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int num = 7;
        double aux = 0;


        for (float i = 0; i <= 2 ; i+=0.2) {
            for (float j = 1; j <= 10; j++ ) {
                System.out.println("I="+ i +" J="+j);
            }
//            num+=2;
//            +=0.2;
        }

    }
}