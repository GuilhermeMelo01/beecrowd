package beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = "fotodoisporquarto.jsp";
        a = a.replaceAll("jsp", "png");
        System.out.println(a);

        String [] b = in.nextLine().split(" ");
        System.out.println(Arrays.toString(b));

        String [] c = in.nextLine().replaceAll(" ", "").split(":");
        System.out.println(Arrays.toString(c));


    }
}
