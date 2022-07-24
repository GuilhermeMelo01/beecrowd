
//Given an array of integers, return a new array with each value doubled.

public class LostWithoutMap {
    public static int[] map(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] *= 2;
        }
        return arr;
//        return Arrays.stream(arr).map(x -> x*2).toArray(); //Lambda
    }

    public static void main(String[] args) {
        int[] map = map(new int[]{1, 2, 3});
    }
}
