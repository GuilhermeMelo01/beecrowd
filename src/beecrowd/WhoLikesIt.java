package beecrowd;

/**
 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
 * pictures or other items. We want to create the text that should be displayed next to such an item.
 *
 * Implement the function which takes an array containing the names of people that like an item. It must
 * return the display text as shown in the examples:
 *
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 */

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if (names.length > 3) {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }else {
            return "no one likes this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
    }


    /*
      --- OUTRA FORMA DE FAZER ESSE PROGRAMA ---
      class Solution {
          public static String whoLikesIt(String... names) {
              switch (names.length) {
                case 0: return "no one likes this";
                case 1: return String.format("%s likes this", names[0]);
                case 2: return String.format("%s and %s like this", names[0], names[1]);
                case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
                default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
              }
          }
      }
     */
}
