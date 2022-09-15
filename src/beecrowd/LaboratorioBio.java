package beecrowd;

import java.util.Scanner;

public class LaboratorioBio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum = 0;

        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                sum += 1;
            }else if(s.charAt(i) == 'b'){
                sum += 2;
            }else if(s.charAt(i) == 'c'){
                sum += 3;
            }else if(s.charAt(i) == 'd'){
                sum += 4;
            }else if(s.charAt(i) == 'e'){
                sum += 5;
            }else if(s.charAt(i) == 'f'){
                sum += 6;
            }else if(s.charAt(i) == 'g'){
                sum += 7;
            }else if(s.charAt(i) == 'h'){
                sum += 8;
            }else if(s.charAt(i) == 'i'){
                sum += 9;
            }else if(s.charAt(i) == 'j'){
                sum += 10;
            }else if(s.charAt(i) == 'k'){
                sum += 11;
            }else if(s.charAt(i) == 'l'){
                sum += 12;
            }else if(s.charAt(i) == 'm'){
                sum += 13;
            }else if(s.charAt(i) == 'n'){
                sum += 14;
            }else if(s.charAt(i) == 'o'){
                sum += 15;
            }else if(s.charAt(i) == 'p'){
                sum += 16;
            }else if(s.charAt(i) == 'q'){
                sum += 17;
            }else if(s.charAt(i) == 'r'){
                sum += 18;
            }else if(s.charAt(i) == 's'){
                sum += 19;
            }else if(s.charAt(i) == 't'){
                sum += 20;
            }else if(s.charAt(i) == 'u'){
                sum += 21;
            }else if(s.charAt(i) == 'v'){
                sum += 22;
            }else if(s.charAt(i) == 'w'){
                sum += 23;
            }else if(s.charAt(i) == 'x'){
                sum += 24;
            }else if(s.charAt(i) == 'y'){
                sum += 25;
            }else{
                sum += 26;
            }
        }
        System.out.println(sum);
    }
}
