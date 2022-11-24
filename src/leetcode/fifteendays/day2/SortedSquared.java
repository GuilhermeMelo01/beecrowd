package leetcode.fifteendays.day2;

public class SortedSquared {
    public int[] sortedSquares(int[] nums) {
        int [] array = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            array[i] = nums[i] * nums[i];
        }

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        return array;
    }
}
