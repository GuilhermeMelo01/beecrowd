//Escreva uma função que recebe um número e retorna um boolean se o número é primo ou não. Números primos são números
// divisíveis apenas por um e o por ele mesmo. Exemplo de números primos: 2, 3, 5, 7, 11, 13, 17...

public class PrimoFuncao {
    public static void main(String[] args) {
        System.out.println(retornaTrueIfValorPrimo(18));
    }

    public static boolean retornaTrueIfValorPrimo(Integer valor){
        int[] valores = new int[valor];
        int count = 0;
        for (int i = 1; i <= valores.length; i++) {
            if (valor%i==0){
                count++;
            }
        }
        if (count > 2){
            return false;
        }
        return true;
    }

}
