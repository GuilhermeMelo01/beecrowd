import java.util.Scanner;

public class CrescenteDecrescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;

        while ((x = in.nextInt()) != (y = in.nextInt())){
            if (x > y){
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
    }
}
