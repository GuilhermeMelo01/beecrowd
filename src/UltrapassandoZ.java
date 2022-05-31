import java.util.Scanner;

//        Faça um programa que leia dois inteiros:X e Z(devem ser lidos tantos valores para Z quantos necessários
//        ,até que seja digitado um valor maior do que X para ele).Conte quantos números inteiros devem ser somados em
//        sequência(considerando o X nesta soma)para que a soma ultrapasse a Z o mínimo possível.Escreva o valor final
//        da contagem.
//
//        A entrada pode conter,por exemplo,os valores 21 21 15 30. Neste caso,é então assumido o valor 21para X enquanto
//        os valores 21 e 15 devem ser desconsiderados pois são menores ou iguais a X.Como o valor 30 está dentro da
//        especificação(maior do que X)ele será válido e então deve-se processar os cálculos para apresentar na saída o
//        valor 2,pois é a quantidade de valores somados para se produzir um valor maior do que 30(21+22).
//
//        ENTRADA
//        A entrada contém somente valores inteiros,um por linha,podendo ser positivos ou negativos.O primeiro valor da
//        entrada será o valor de X.A próxima linha da entrada irá conter Z.Se Z não atender a especificação do problema
//        ,ele deverá ser lido novamente,tantas vezes quantas forem necessárias.
//
//        SAIDA
//        Imprima uma linha com um número inteiro que representa a quantidade de números inteiros que devem ser somadas,
//        de acordo com a especificação acima.

public class UltrapassandoZ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, z, count = 1;

        x = in.nextInt();

        do {
            z = in.nextInt();
        } while (z <= x);

        for (int i = x + 1; true; i++) {
            x += i;
            count++;
            if (x > z) {
                break;
            }
        }
        System.out.println(count);
    }
}
