package beecrowd;

/**
 * Our football team finished the championship. The result of each match look like "x:y". Results of all matches
 * are recorded in the collection.
 *
 * For example: ["3:1", "2:2", "0:1", ...]
 *
 * Write a function that takes such collection and counts the points of our team in the championship. Rules for
 * counting points for each match:
 *
 * if x > y: 3 points
 * if x < y: 0 point
 * if x = y: 1 point
 * Notes:
 *
 * there are 10 matches in the championship
 * 0 <= x <= 4
 * 0 <= y <= 4
*/
public class TotalAmountPoints {
    public static int points(String[] games) {
        int amount = 0;
        for (int i = 0; i < games.length; i++) {
            String[] gols = games[i].split(":");
            if (Integer.parseInt(gols[0]) > Integer.parseInt(gols[1])) {
                amount += 3;
            } else if (Integer.parseInt(gols[0]) < Integer.parseInt(gols[1])) {
                amount += 0;
            } else {
                amount += 1;
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        int points = points(new String[]{"1:0", "4:3", "2:2"});
        System.out.println(points);
    }
}
