package leetcode.fifteendays.day1;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int inicio = 0;
        int fim = nums.length-1;
        int meio;
        while(inicio <= fim){
            meio = (inicio + fim) / 2;
            if(nums[meio] == target){
                return meio;
            }else if(nums[meio] < target){
                inicio = meio+1;
            }else{
                fim = meio-1;
            }
        }
        return -1;
    }
}
