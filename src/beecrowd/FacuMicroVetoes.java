package beecrowd;

import java.util.Scanner;

public class FacuMicroVetoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int [] numeros1 = new int[10];
//        int [] numeros2 = new int[10];
//        int [] numeros3 = new int[10];
//        int total1 = 0, total2 = 0, somaInd, total3=0, media3=0;
//
//        for (int i = 0; i < numeros1.length; i++) {
//            System.out.print("Digite um numero 1: ");
//            numeros1[i] = in.nextInt();
//            total1 += numeros1[i];
//        }
//        System.out.println(total1);
//
//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.print("Digite um numero 2: ");
//            numeros2[i] = in.nextInt();
//            total2 += numeros2[i];
//        }
//        System.out.println(total2);
//
//        for (int i = 0; i < numeros3.length; i++) {
//            somaInd = numeros1[i] + numeros2[i];
//            total3 += somaInd;
//            media3 = total3 / numeros3.length;
//            System.out.println("Soma do indice "+ i +" "+somaInd);
//        }
//        System.out.println(media3);


        System.out.println("----------------------------------------");

//        int [] numeros = new int[10];
//        int maior = 0, menor = (int) Math.pow(9, 9);
//
//        for (int i = 0; i < numeros.length; i++) {
//            numeros[i] = (int) (Math.random()*100);
//            System.out.println(numeros[i]);
//            if (numeros[i] > maior){
//                maior = numeros[i];
//            }
//            if (numeros[i] < menor){
//                menor = numeros[i];
//            }
//        }
//        System.out.println("Maior: "+ maior);
//        System.out.println("Menor: "+ menor);


        System.out.println("000000000000000000000000000000000000000000");

        int ano;

        ano = in.nextInt();

        if (ano % 4 == 0){
            System.out.println(ano + " Esse ano é Bixesto");
        }else {
            System.out.println("Esse ano nao é bixesto");
        }

    }
}
