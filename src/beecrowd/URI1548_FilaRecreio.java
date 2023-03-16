package beecrowd;

import java.util.Scanner;

public class URI1548_FilaRecreio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int quantidadeCasos = in.nextInt();
        int count = quantidadeCasos;
        while (quantidadeCasos > 0) {
            int numerosDeAlunos = in.nextInt();

            int[] notasBase = new int[numerosDeAlunos];
            int[] notasModificadas = new int[numerosDeAlunos];
            int i = 0;
            while (i < numerosDeAlunos) {
                notasBase[i] = in.nextInt();
                notasModificadas[i] = notasBase[i];
                i++;
            }

            for (int j = 0; j < notasModificadas.length; j++) {
                for (int k = j + 1; k < notasModificadas.length; k++) {
                    if (notasModificadas[j] < notasModificadas[k]) {
                        int aux = notasModificadas[j];
                        notasModificadas[j] = notasModificadas[k];
                        notasModificadas[k] = aux;
                    }
                }
            }

            int modificadas = 0;
            for (int j = 0; j < notasModificadas.length; j++) {
                if(notasModificadas[j] == notasBase[j]){
                    modificadas++;
                }
            }

            System.out.println(modificadas);
            quantidadeCasos--;
        }
    }
}
