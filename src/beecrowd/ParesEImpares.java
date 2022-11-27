package beecrowd;

import java.util.*;

public class ParesEImpares {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int entrada = in.nextInt();
        List<Integer> valores = new ArrayList<>();
        List<Integer> valorImpar = new ArrayList<>();
        List<Integer> valorPar = new ArrayList<>();


        while (entrada > 0) {
            int valor = in.nextInt();
            valores.add(valor);
            entrada--;
        }


        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) % 2 == 0) {
                valorPar.add(valores.get(i));
            } else {
                valorImpar.add(valores.get(i));
            }
        }

        Collections.sort(valorPar);
        Collections.sort(valorImpar);
        Collections.reverse(valorImpar);

        for (Integer v : valorPar) {
            System.out.println(v);
        }

        for (Integer v : valorImpar) {
            System.out.println(v);
        }
    }

}