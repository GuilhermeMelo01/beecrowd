package codewar;

//        The Collatz Conjecture states that for any natural number n, if n is even,
//        divide it by 2. If n is odd, multiply it by 3 and add 1. If you repeat the process continuously
//        for n, n will eventually reach 1.

//        For example, if n = 20, the resulting sequence will be:

//        [ 20, 10, 5, 16, 8, 4, 2, 1 ]
//        Write a program that will output the length of the Collatz Conjecture for any given n.
//        In the example above, the output would be 8.

public class Collatz {
    public static long conjecture(long x){
        long count = 1;
        while(x != 1){
            if(x % 2 == 0){
                x = x / 2;
            }else{
                x = (x * 3) + 1;
            }
            count++;
        }
        System.out.println(count);
        return count;
        }

    public static void main(String[] args) {
        conjecture(100L);
    }
}
