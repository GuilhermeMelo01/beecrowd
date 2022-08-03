import java.util.List;

//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

//Return your answer as a number.

public class SumMixedArray {
    public static int sum(List<?> mixed) {
        int soma=0;
        for (Object o : mixed) {
            int i = Integer.parseInt(o.toString());
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        int sum = sum(List.of("1", 2, 4, "3", 5, "10"));
        System.out.println(sum);
    }
}

