package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1068_BalancoParentesI {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int count;
        String retorno;
        String valor;

        while (in.ready()) {
            count = 0;
            valor = in.readLine();
            for (int i = 0; i < valor.length(); i++) {
                if (valor.charAt(i) == ')' && count == 0) {
                    count--;
                    break;
                }
                if (valor.charAt(i) == '(') {
                    count++;
                }
                if (valor.charAt(i) == ')' && count > 0) {
                    count--;
                }
            }

            if (count == 0) {
                retorno = "correct";
            } else {
                retorno = "incorrect";
            }

            System.out.println(retorno);
        }
    }
}
