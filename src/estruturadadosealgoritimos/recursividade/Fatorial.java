package estruturadadosealgoritimos.recursividade;

public class Fatorial {
    public static void main(String[] args) {
        int [] fat = {1,2,3,4,5};

        for (int i = 1; i < fat.length; i++) {
            fat[i] = fat[i] * fat[i-1];
        }

        for (Integer i: fat){
            System.out.println(i);
        }
    }
}
