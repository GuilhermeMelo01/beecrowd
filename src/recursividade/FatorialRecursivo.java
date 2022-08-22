package recursividade;

public class FatorialRecursivo {
    public static void main(String[] args) {
        int fatorial = fatorial(6);
        System.out.println(fatorial);
    }

    public static int fatorial(int x){
        if (x <= 1){
            return 1;
        }else{
            return x * fatorial(x-1);
        }
    }
}
