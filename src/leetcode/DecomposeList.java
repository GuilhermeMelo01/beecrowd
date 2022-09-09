package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DecomposeList {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> lista = new ArrayList<>();
        int freq, val;

        for(int i=0; i < nums.length; i+=2){
            for(int j= i+1; j < i+2; j++){
                if(j < nums.length) {
                    freq = nums[i];
                    val = nums[j];
                    for (int k = 0; k < freq; k++) {
                        lista.add(val);
                    }
                }
            }
        }
        int[] array = new int[lista.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = lista.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] ints = decompressRLElist(new int[]{1,1,2,3});
        for (int i : ints){
            System.out.print(i+" ");
        }
    }
}
