package beecrowd;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class A {

     static boolean exists(int[] ints, int k){
         
         if (Arrays.stream(ints).anyMatch(i -> i == k)){
             System.out.println(true);
             return true;
         }
         System.out.println(false);
         return false;
     }

    public static void main(String[] args) {
        int [] ints = {-9, 14, 37, 102};
        exists(ints, 14);
    }

}
