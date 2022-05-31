import java.util.Arrays;

public class Exists {
    public static void main(String[] args) {
        System.out.println(exists(new int[]{12, 15, 25, 64}, 25));
    }

    public static boolean exists(int[] ts, int k) {
        for (int i = 1; i < ts.length; i++) {
            if (ts[i - 1] > ts[i]) {
                return false;
            }
        }
        if (ts.length >= 1 && ts.length <= 1000000) {
            if (Arrays.stream(ts).anyMatch(v -> v == k)) {
                return true;
            }
        }
        return false;
    }

}
