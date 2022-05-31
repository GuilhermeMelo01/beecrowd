import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int golInter, golGremio, x, cont = 0, vitInter=0, vitGremio=0, numEmpate=0;

        do {
            golInter = in.nextInt();
            golGremio = in.nextInt();
            cont++;
            if (golInter > golGremio){
                vitInter++;
            } else if (golInter < golGremio){
                vitGremio++;
            } else {
                numEmpate++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            x = in.nextInt();
        }while(x != 2);
        System.out.println(cont +" grenais");
        System.out.println("Inter:"+ vitInter);
        System.out.println("Gremio:"+ vitGremio);
        System.out.println("Empates:"+ numEmpate);
        if (vitInter > vitGremio){
            System.out.println("Inter venceu mais");
        }else if (vitInter < vitGremio){
            System.out.println("Gremio venceu mais");
        } else{
            System.out.println("Nao houve vencedor");
        }
    }
}
