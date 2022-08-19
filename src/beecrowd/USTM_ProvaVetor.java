package beecrowd;

import java.util.Scanner;

public class USTM_ProvaVetor {
    public static void main(String[] args) {

        //1 QUESTAO:
        System.out.println("PRIMEIRA QUESTAO:");
        int[] vetorAQ1 = new int[10];

        for (int i = 0; i < vetorAQ1.length; i++) {
            vetorAQ1[i] =(int) (Math.random() * vetorAQ1.length);
        }

        int[] vetorBQ1 = new int[10];

        for (int i = 0; i < vetorBQ1.length; i++) {
            vetorBQ1[i] = vetorAQ1[i] * i;
        }

        for (int i = 0; i < vetorAQ1.length; i++) {
            System.out.print(vetorAQ1[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < vetorBQ1.length; i++) {
            System.out.print(vetorBQ1[i]+" ");
        }

        System.out.println("---------------------------------------");
        //2 QUESTAO:
        System.out.println("\n\nSEGUNDA QUESTAO:");

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = in.nextInt();
        int soma=0;
        int[] vetorQ2 = new int[tamanho];
        for (int i = 0; i < vetorQ2.length; i++) {
            vetorQ2[i] = (int)(Math.random() * vetorQ2.length);
        }

        for (int i = 0; i < vetorQ2.length; i++) {
            soma += vetorQ2[i];
            System.out.print(vetorQ2[i]+" ");
        }
        System.out.println("\nSOMA: "+ soma);


        System.out.println("\n---------------------------------------");
        //3 QUESTAO:
        System.out.println("\n\nTERCEIRA QUESTAO:");

        int [] vetorQ3 = new int[4];
        int countImpar=0, countPar=0;
        for(int i = 0; i < vetorQ3.length; i++){
            System.out.print("Digite um valor para o vetor: " );
            vetorQ3[i] = in.nextInt();
            if (vetorQ3[i] % 2 == 0){
                countPar++;
            }else{
                countImpar++;
            }
        }
        System.out.println("\nQUANTIDADE DE IMPARES: "+ countImpar + "\nQUANTIDADE DE PARES: "+ countPar);


        System.out.println("\n---------------------------------------");
        //4 QUESTAO:
        System.out.println("\n\nQUARTA QUESTAO:");
    }
}
