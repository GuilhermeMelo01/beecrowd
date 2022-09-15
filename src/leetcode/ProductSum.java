package leetcode;

public class ProductSum {
    public int subtractProductAndSum(int n) {
        String x = String.valueOf(n);
        String[] valores = x.split("");
        int sum=0, prod=1;
        for(int i=0; i < valores.length; i++){
            sum += Integer.parseInt(valores[i]);
            prod *= Integer.parseInt(valores[i]);
        }
        return prod - sum;
    }

    public static void main(String[] args) {
        ProductSum productSum = new ProductSum();
        int i = productSum.subtractProductAndSum(234);
        System.out.println(i);

    }
}
