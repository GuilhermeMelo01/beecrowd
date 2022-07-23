//In this kata you get the start number and the end number of a region and should return the count of all numbers
// except numbers with a 5 in it. The start and the end number are both inclusive!

public class NotGive5 {
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            String number = String.valueOf(i);
            if (!number.contains("5")){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        NotGive5.dontGiveMeFive(1,9);
    }
}


