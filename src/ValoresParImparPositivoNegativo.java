import java.util.Scanner;

public class ValoresParImparPositivoNegativo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valores, countPar = 0, countImpar = 0, countPos = 0, countNeg = 0;

        for (int i = 0; i < 5; i++) {
            valores = in.nextInt();
            if (Math.abs(valores) % 2 == 0){
                countPar++;
            }
            if (Math.abs(valores) % 2 == 1){
                countImpar++;
            }
            if (valores > 0){
                countPos++;
            }
            if (valores < 0){
                countNeg++;
            }
        }
        System.out.println(countPar + " valor(es) par(es)");
        System.out.println(countImpar + " valor(es) impar(es)");
        System.out.println(countPos + " valor(es) positivo(s)");
        System.out.println(countNeg + "  valor(es) negativo(s)");
    }
}
