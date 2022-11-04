package beecrowd.resolvendo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JogandoCartasFora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cartas = in.nextInt();

        while(cartas != 0){
            Stack<Integer> pilha = new Stack<>();
            List<Integer> descartadas = new ArrayList<>();
            List<Integer> resto = new ArrayList<>();
            int remanescente;

            for(int i=cartas; i >= 1; i--){
                pilha.push(i);
            }

            while(pilha.size() >= 2 ){
                Integer descarte = pilha.pop();
                descartadas.add(descarte);

                Integer base = pilha.pop();
                while(!pilha.isEmpty()){
                    resto.add(pilha.pop());
                }
                resto.add(base);

                int size = resto.size()-1;
                while(size >= 0){
                    pilha.push(resto.get(size));
                    resto.remove(size);
                    size--;
                }
            }
            remanescente = pilha.pop();

            System.out.print("Discarded cards:");
            for(int z: descartadas){
                System.out.print(" "+ z);
            }
            System.out.println("\nRemaining cards: "+ remanescente);

            cartas = in.nextInt();
        }
    }
}
