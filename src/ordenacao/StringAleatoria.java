package ordenacao;

public class StringAleatoria {
    public static String getStringAleatoria(){

        String alphaString = "ABCDEFGHIJKLMNOPQRSTUVXWZ";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            int index = (int) (Math.random() * alphaString.length());
            sb.append(alphaString.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getStringAleatoria());
    }
}
