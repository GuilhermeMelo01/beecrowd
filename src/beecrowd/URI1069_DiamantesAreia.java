package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class URI1069_DiamantesAreia {
    //wrong answer 15%
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack;

        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            String valor = br.readLine();
            int count = 0;
            stack = new Stack<>();
            for (int i = 0; i < valor.length(); i++) {
                if (valor.charAt(i) == '<') {
                    stack.push(valor.charAt(i));
                }
                if (valor.charAt(i) == '>' && !stack.empty()) {
                    stack.pop();
                    count++;
                }
            }
            System.out.println(count);
            n--;
        }
    }
}
