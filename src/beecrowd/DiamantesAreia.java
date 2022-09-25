package beecrowd;

import java.util.Scanner;
import java.util.Stack;

public class DiamantesAreia {
    //wrong answer 15%
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int n = in.nextInt();

        while(n > 0){
            String valor = in.next();
            int count=0;
            for (int i = 0; i < valor.length(); i++) {
                if(valor.charAt(i) == '<'){
                    stack.push(valor.charAt(i));
                }
                if(valor.charAt(i) == '>' && !stack.empty()){
                    stack.pop();
                    count++;
                }
            }
            System.out.println(count);
            n--;
        }
    }
}
