package beecrowd;

import java.util.*;

public class OndeEstaOMarmore {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeMarmore;
        int quantidadeConsulta;

        List<Integer> numMarmore = new ArrayList<>();
        Deque<Integer> numConsultas = new ArrayDeque<>();

        int count = 1;
        int have = 0;
        int posicao = 0;

        quantidadeMarmore = entrada.nextInt();
        quantidadeConsulta = entrada.nextInt();

        while (quantidadeMarmore != 0 || quantidadeConsulta != 0) {
            System.out.printf("CASE# %d:\n", count);
            count++;

            for (int i = 0; i < quantidadeMarmore; i++) {
                numMarmore.add(entrada.nextInt());
            }
            for (int i = 0; i < quantidadeConsulta; i++) {
                numConsultas.add(entrada.nextInt());
            }

            while (!numConsultas.isEmpty()) {
                Integer valor = numConsultas.pop();
                for (int i = 0; i < numMarmore.size(); i++) {
                    if (valor.equals(numMarmore.get(i))) {
                        have = 1;
                        posicao = i + 2;
                        System.out.printf("%d found at %d\n", valor, posicao);
                        break;
                    }
                }
                if (have == 0) {
                    System.out.printf("%d not found\n", valor);
                }
                have = 0;
            }

            numMarmore.clear();
            numConsultas.clear();

            quantidadeMarmore = entrada.nextInt();
            quantidadeConsulta = entrada.nextInt();
        }
    }
}
