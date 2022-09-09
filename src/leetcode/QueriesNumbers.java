package leetcode;

public class QueriesNumbers {
    static class Solution {
        public static int[] countPoints(int[][] points, int[][] queries) {
            int[] result = new int[queries.length];

            for (int i = 0; i < queries.length; ++i){
                for (int j = 0; j < points.length; ++j){
                    if (calcDistance(points[j], queries[i]))
                        ++result[i];
                }
            }

            return result;
        }

        static boolean calcDistance(int [] point, int[] query) {
            double x = Math.pow((point[0] - query[0]), 2), y = Math.pow((point[1] - query[1]), 2);
            double dist = Math.pow((x + y), 0.5);

            return dist > (double)query[2] ? false : true;
        }
    }

    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,2},{1,1,2}};
        int[] ints = Solution.countPoints(points, queries);
        for(Integer i: ints){
            System.out.print(i+" ");
        }

    }
}
