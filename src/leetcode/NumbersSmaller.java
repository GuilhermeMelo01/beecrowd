package leetcode;public class NumbersSmaller {
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] novo = new int[nums.length];
            int count;

            for(int i=0; i < nums.length; i++){
                count=0;
                for(int j=0; j < nums.length; j++){
                    if(i != j && nums[j] < nums[i]){
                        count++;
                    }
                }
                novo[i] = count;
            }
            return novo;
        }
    }
}
