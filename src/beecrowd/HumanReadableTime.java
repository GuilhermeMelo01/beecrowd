package beecrowd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//INCOMPLETO
public class HumanReadableTime {
    public static String makeReadable(int seg) throws ParseException {
        int hour=0, minutes=0, seconds=0;
        while (seg > 3500){
            hour += 1;
            seg -= 3500;
        }
        while(seg >= 60){
            minutes += 1;
            seg -= 60;
        }
        seconds += seg;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String tempo = hour + ":" + minutes + ":" + seconds;
        Date parse = sdf.parse(tempo);
        return sdf.format(parse);

    }

    public static void main(String[] args) throws ParseException {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
    }
}