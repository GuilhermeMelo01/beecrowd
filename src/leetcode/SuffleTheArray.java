package leetcode;

public class SuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2]; //creating 2n length of array
        for(int i=0; i<n; i++) {
            ans[i*2] = nums[i]; // ans[i(0,1,2) * 2]=nums[0,1,2]   //[2,_,5,_,1,_]
            ans[i*2+1] = nums[i+n];// ans[i(0,1,2) * 2 + 1]=nums[0,1,2 + 1]  // [2,3,5,4,1,7]
        }
        return ans;
    }

    public static void main(String[] args) {
        SuffleTheArray s = new SuffleTheArray();
        int[] num = {2,5,1,3,4,7};
        s.shuffle(num, 3);
    }
}
