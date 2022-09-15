package otimizza;

public class MaiorOtimiza {
    public Integer maiorValor(int[] valores){
        int maior = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        MaiorOtimiza maiorOtimiza = new MaiorOtimiza();
        Integer integer = maiorOtimiza.maiorValor(new int[]{22, 383, 320, 400, 999});
        System.out.println(integer);
    }
}
