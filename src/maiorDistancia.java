import java.util.Scanner;

public class maiorDistancia {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int max = 0;
        int min = 1000000;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a > max){
                max = a;
            }
            if (a < min){
                min = a;
            }
        }
        int between = max - min;
        System.out.println(between);

    }

}

