package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class URI1244_OrdenacaoPorTamanho {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int casosTestes = in.nextInt();
        in.nextLine();

        while (casosTestes > 0){
            String texto = in.nextLine();
            String[] valores = texto.split(" ");

            for (int i = 0; i < valores.length; i++) {
                for (int j = i+1; j < valores.length; j++) {
                    if(valores[i].length() < valores[j].length()){
                        int z = j;
                        while(z > i){
                            String aux = valores[z];
                            valores[z] = valores[z-1];
                            valores[z-1] = aux;
                            z--;
                        }
                    }
                }
            }

            String ultimo = valores[valores.length-1];
            int indexUltimo = valores.length-1;
            for(int i = 0; i < valores.length; i++){
                if(valores[i].equals(ultimo) && i == indexUltimo){
                    System.out.println(valores[i]);
                }else{
                    System.out.print(valores[i]+ " ");
                }
            }
            casosTestes--;
        }
    }
}
