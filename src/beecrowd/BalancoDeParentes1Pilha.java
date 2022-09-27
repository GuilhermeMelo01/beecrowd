package beecrowd;

import java.util.Scanner;
import java.util.Stack;

public class BalancoDeParentes1Pilha {
    //Incorreto
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        String valor = in.next();

        String v = "";
        for(int i=0; i < valor.length(); i++){
            if(valor.charAt(i) == '('){
                s.push(valor.charAt(i));
            }
            if (valor.charAt(i)  == ')' && s.empty()){
                v = "incorrect";
                break;
            }else if(valor.charAt(i) == ')'){
                s.pop();
            }
        }

        if(v.equals("incorrect") || !s.empty()){
            System.out.println("incorrect");
        }else{
            System.out.println("correct");
        }
    }
}
