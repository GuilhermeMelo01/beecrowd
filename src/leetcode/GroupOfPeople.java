package leetcode;

import java.util.*;

public class GroupOfPeople {
    public static void main(String[] args) {
        Map<Integer, String> pessoa = new HashMap<>();

        pessoa.put(1, "Guilherme");
        pessoa.put(3, "Monalisa");
        pessoa.put(4, "Maria");
        pessoa.put(2, "Juan");

        System.out.println(pessoa.values());
        System.out.println(pessoa.keySet());
        System.out.println(pessoa.entrySet());

    }
}
