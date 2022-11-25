package leetcode.fifteendays.day2;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int aux = 0;
        for(int i = nums.length-1; i >= 0; i--){
            if(i == nums.length-1){
                aux = nums[0];
                nums[0] = nums[i];
                nums[i] = aux;
            }else{
                aux = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = aux;
            }
        }
    }

    public static void main(String[] args) {
        RotateArray r = new RotateArray();

        r.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
