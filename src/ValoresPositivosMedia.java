import java.util.Scanner;

public class ValoresPositivosMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valores, totPos, valPos = 0;
        int count = 0;

        for (int i = 0; i < 6; i++) {
            valores = in.nextFloat();
            if (valores > 0){
                valPos += valores;
                count++;
            }
        }
        totPos = valPos / count;
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n", totPos);
        in.close();
    }
}
