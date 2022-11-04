package ciet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Consumo {
    public static Integer ultimaParada(Integer combustivel, Integer consumo, List<Integer> postosDeGasolina) {
        int quantidade = combustivel * consumo;
        int maior = -1;

        for (int i = 0; i < postosDeGasolina.size(); i++) {
            if(quantidade >= postosDeGasolina.get(i) && postosDeGasolina.get(i) > maior){
                maior = postosDeGasolina.get(i);
            }
        }

        if (quantidade == 0){
            return -1;
        }
        return maior;
    }

    // DESAFIO 2
    public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {
        Integer maior=0, menor=500;
        int a = 0;
        for (int i = 0; i < tickets.size(); i++) {
            List<Integer> lista = tickets.get(a).stream().sorted().toList();
            for (int j = 0; j < lista.size(); j++) {
                if(lista.get(j) > 20 && lista.get(j) < 500){
                    if (lista.get(j) < menor){
                        menor = lista.get(j);
                    }
                    if (lista.get(lista.size()-1) > maior){
                        maior = lista.get(lista.size()-1);
                    }
                }
            }
            a++;
        }
        return List.of(menor, maior);
    }

    public static Integer calculaNumeroDaSenha(List<String> senha) {
        StringBuilder numeroBinario = new StringBuilder();
        int zero =0, um=0, inicial=0;
        for (int i = 0; i < senha.size(); i++) {
            for (int j = 0; j < senha.size(); j++) {
                if(senha.get(inicial).charAt(j) == '1'){
                    um += 1;
                }else{
                    zero += 1;
                }
                if (senha.get(j).equals(senha.get(senha.size()-1))){
                    if(zero > um){
                        numeroBinario.append("0");
                    }else{
                        numeroBinario.append("1");
                    }
                    um = 0;
                    zero = 0;
                    inicial++;
                }
            }
        }
        return Integer.parseInt(String.valueOf(numeroBinario));
    }

    public static void main(String[] args) {
//        Consumo.ultimaParada(2, 8, new ArrayList<>(List.of(2, 15, 22, 10)));
//        retornaMenorEMaiorValorDeVendas(Arrays.asList(Arrays.asList(0, 200,100), Arrays.asList(300)));
        Integer integer = Consumo.calculaNumeroDaSenha(Arrays.asList("0110100000", "1001011111", "1110001010",
                "0111010101", "0011100110", "1010011001", "1101100100", "1011010100", "1001100111", "1000011000"));
        System.out.println(integer);
    }
}
