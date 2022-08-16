package beecrowd;

public class StringEndsWith {
    public static boolean solution(String str, String ending){
        return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));
    }
}
