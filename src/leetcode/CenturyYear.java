package leetcode;

public class CenturyYear {
    int solution(int year) {
        if(year % 100 == 0){
            return year / 100;
        }else{
            return year / 100 + 1;  // 50 / 100 ==
        }
    }

    public static void main(String[] args) {
        CenturyYear ct = new CenturyYear();
        int solution = ct.solution(1701);
        System.out.println(solution);
    }

}
