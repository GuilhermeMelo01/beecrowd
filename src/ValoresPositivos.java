import java.util.Scanner;

public class ValoresPositivos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valores;
        int count = 0;

        for (int i = 0; i < 6; i++) {
            valores = in.nextFloat();
            if (valores > 0){
                count++;
            }
        }
        System.out.println(count + " valores positivos");
        in.close();
    }
}
