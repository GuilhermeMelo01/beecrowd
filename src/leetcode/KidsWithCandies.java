package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
There are n kids with candies. You are given an integer array candies, where each candies[i]
 represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra
  candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid
all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
*/

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //n kids with candies
        //candies[i] = numero de candies dos kids
        int maior = candies[0];
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > maior){
                maior = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= maior){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
