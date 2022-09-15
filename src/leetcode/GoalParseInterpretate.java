package leetcode;

public class GoalParseInterpretate {
    public String interpret(String command) {
        String sub = "";
        for(int i=0; i < command.length();){
            if(command.charAt(i) == 'G'){
                sub = sub.concat("G");
                i++;
            }else if(command.charAt(i)== '(' && command.charAt(i+1) == ')'){
                sub = sub.concat("o");
                i+=2;
            }else{
                sub = sub.concat("al");
                i+=4;
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        GoalParseInterpretate goalParseInterpretate = new GoalParseInterpretate();
        String i = goalParseInterpretate.interpret("G()(al)");
        System.out.println(i);
    }
}
