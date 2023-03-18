package beecrowd;

import java.util.Scanner;

public class URI2006_IdentificandoCha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vCorreto = in.nextInt();
        int cTestes = 5, valorTotal = 0;
        while(cTestes > 0){
            int vCompetidor = in.nextInt();
            if(vCorreto == vCompetidor && vCompetidor >= 1 && vCompetidor <= 5){
                valorTotal++;
            }
            cTestes--;
        }
        System.out.println(valorTotal);
    }
}
