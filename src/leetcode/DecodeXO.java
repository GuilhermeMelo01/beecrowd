package leetcode;

import java.util.zip.DeflaterOutputStream;

public class DecodeXO {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
           arr[i+1] = arr[i]^encoded[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        DecodeXO decodeXO = new DecodeXO();
        int[] decode = decodeXO.decode(new int[]{1, 2, 3}, 1);
        for (int i: decode){
            System.out.print(i+" ");
        }
    }
}
