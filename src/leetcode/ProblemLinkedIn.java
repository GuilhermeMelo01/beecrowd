package leetcode;

import java.util.Arrays;

public class ProblemLinkedIn {
    public static Integer[] addToUpTarget(Integer[] array, Integer target){

        Integer[] arrayReturn = new Integer[2];

        for(int i=0; i < array.length; i++){
            for(int j=i+1; j < array.length; j++){
                if((array[i] + array[j]) == target){
                    arrayReturn[0] = i;
                    arrayReturn[1] = j;
                    return arrayReturn;
                }
            }
        }
        return arrayReturn;
    }

    public static void main(String[] args) {
        Integer[] integers = addToUpTarget(new Integer[]{2, 7, 11, 15}, 10);
        System.out.println(Arrays.toString(integers));
    }
}
