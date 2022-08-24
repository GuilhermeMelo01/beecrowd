package leetcode;

public class JewelsStones {
    public static int numJewelsInStones(String jewels, String stones) {
/*            You're given strings jewels representing the types of stones that are jewels,
            and stones representing the stones you have. Each character in stones is
            a type of stone you have. You want to know how many of the stones you have are also jewels.

            Letters are case sensitive, so "a" is considered a different type of stone from "A".*/
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            char charJ = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                char charS = stones.charAt(j);
                if (charJ == charS) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
