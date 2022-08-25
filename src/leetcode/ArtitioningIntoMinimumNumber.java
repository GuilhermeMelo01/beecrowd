package leetcode;

public class ArtitioningIntoMinimumNumber {
    /*
    partitioning into minumum Number

- deci-binary é quando o numero tem apenas 0 e 1 sem lider 0 ex: 101 1100;

- Recebido uma String 'n' que representa um numero decimal positivo

- retornar o minimo de numeros positivos deci-binary para fazer a soma dessa String 'n'
*/

    public static int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans = Math.max(n.charAt(i) - '0', ans); //n.charAt(i) - '0' transforma o char de 'n' em integer!
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("44"));
    }
}
