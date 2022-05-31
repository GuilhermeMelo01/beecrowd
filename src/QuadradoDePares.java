import java.util.Locale;
import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;

        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                System.out.println(i +"^2 " + (i*i));
            }
        }



//                System.out.println(i +"^"+i +" = "+ (i*i));
    }
}
