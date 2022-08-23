package leetcode;

import java.util.Scanner;

public class ManipulacaoVetor {
    public static void main(String[] args) {

        //CRIAÇÃO DO VETOR
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i]+" ");
        }

        //ORDENAÇÃO DO VETOR
        quickSort(array, 0, array.length-1);

        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        //BUSCAR BINARIA POR VALOR NA POSICAO DO VETOR
        System.out.println("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor que você quer buscar no vetor: ");
        int z = in.nextInt();
        int i = buscaBinaria(array, z);
        System.out.println(i);


    }

    private static void quickSort(int[] array, int inicio, int fim){
        if (inicio < fim){
            int pivo = particao(array, inicio, fim);
            quickSort(array, inicio, pivo);
            quickSort(array, pivo + 1, fim);
        }
    }

    private static int particao(int[] array, int inicio, int fim){
        int meio = (inicio + fim) /2;
        int pivo = array[meio];
        int esquerda = inicio-1;
        int direita = fim+1;
        while(true){
            do{
                esquerda++;
            }while(array[esquerda] < pivo);
            do {
                direita--;
            }while(array[direita] > pivo);
            if(esquerda >= direita){
                return direita;
            }
            int aux = array[esquerda];
            array[esquerda] = array[direita];
            array[direita] = aux;
        }
    }

    private static int buscaBinaria(int[] array, int valor){
        int inicio = 0;
        int fim = array.length-1;

        while(inicio <= fim){
            int meio = (inicio + fim) / 2;
            if (array[meio] > valor){
                fim = meio-1;
            }else if(array[meio] < valor){
                inicio = meio+1;
            }else{
                return meio;
            }
        }
        return -1;
    }
}