import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Grau0 {

    public static void main(String[] args) {
        System.out.println(computerToZero(new int[]{12, 3, -4, 7, 1, -1}));
    }

    public static int computerToZero(int[] ts) {
//        if (ts.length == 0) return 0;

//        int numMeta = 0;
//
//        List<Integer> list = Arrays.stream(ts).boxed().collect(Collectors.toList());

       return Arrays.stream(ts).filter(i -> i != 0)
                .reduce((a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b)).orElseThrow();


    }
}
