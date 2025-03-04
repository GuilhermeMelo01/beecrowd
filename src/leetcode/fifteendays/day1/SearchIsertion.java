package leetcode.fifteendays.day1;

//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.

//You must write an algorithm with O(log n) runtime complexity.

public class SearchIsertion {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target || target < nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
