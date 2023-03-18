package beecrowd;

import java.util.*;

public class URI1281_IdaAFeira {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int qDCasos = in.nextInt();
        while(qDCasos > 0){
            int qpDisponiveis = in.nextInt();
            in.nextLine();
            Map<String, Double> nome_preco = new HashMap<>();
            Map<String, Integer> nome_quantidade = new HashMap<>();
            while(qpDisponiveis > 0){
                String texto = in.nextLine();
                String[] split = texto.split(" ");
                nome_preco.put(split[0], Double.parseDouble(split[1]));
                qpDisponiveis--;
            }

            int qpDesejados = in.nextInt();
            in.nextLine();
            while(qpDesejados > 0){
                String texto = in.nextLine();
                String[] split = texto.split(" ");
                nome_quantidade.put(split[0], Integer.parseInt(split[1]));
                qpDesejados--;
            }

            double valorCompras = 0;
            Set<String> nome_produto_desejado = nome_quantidade.keySet();
                for(String v: nome_produto_desejado){
                        Integer quantidade = nome_quantidade.get(v);
                        Double preco = nome_preco.get(v);
                        valorCompras += (quantidade * preco);
                }

            System.out.printf("R$ %.2f\n", valorCompras);
            qDCasos--;
            }
        }
    }
