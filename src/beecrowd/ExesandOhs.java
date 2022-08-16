package beecrowd;

public class ExesandOhs {
    public static boolean getXO(String str) {
        /*
          str = str.toLowerCase();
 return str.replace("o", "").length() == str.replace("x", "").length();
       */

        int x = 0, o = 0;
        String[] letras = str.toLowerCase().split("");
        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equals("o")) {
                o++;
            }
            if (letras[i].equals("x")) {
                x++;
            }
        }
        return x == o;

    }

    public static void main(String[] args) {
        System.out.println(getXO("Ooxx"));
    }
}
