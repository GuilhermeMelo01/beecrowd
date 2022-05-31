import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class numeroPositivo0 {


        public static void main(String[] args) {
            int[] str = {2,3,-2};
            Arrays.stream(str).filter(i -> i != 0)
                    .reduce((a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b))
                    .ifPresent(System.out::println);
        }
}
