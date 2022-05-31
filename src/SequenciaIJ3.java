public class SequenciaIJ3 {
    public static void main(String[] args) {

        int num = 7, aux = 5;


        for (int i = 1; i <= 9 ; i+=2) {
            for (int j = num; j >= aux; j--) {
                System.out.println("I="+ i +" J="+j);
            }
            num+=2;
            aux+=2;
        }

    }
}