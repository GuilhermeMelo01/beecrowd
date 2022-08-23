package leetcode;

public class BuildArrayFromPermuntation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            if (i >= 0 && i < nums.length){
                ans[i] = nums[nums[i]];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
