package leetcode;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
        int count=0;
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }
}
