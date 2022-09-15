package otimizza;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateOtimiza {
    public String retornaData(String valor) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
                .parseCaseInsensitive().parseLenient();
        String[] espaco = valor.split("");

        if (!espaco[2].equals(" ") && !espaco[2].equals("/")) {
            builder.appendPattern("[yyyy MM dd]")
                    .appendPattern("[ddMMyyyy]");
        } else {
            builder.appendPattern("[dd/MM/yyyy]")
                    .appendPattern("[dd MM yyyy]");
        }

        DateTimeFormatter formatter = builder.toFormatter();
        LocalDate parse = LocalDate.parse(valor, formatter);
        return parse.format(DateTimeFormatter.ofPattern("yyyy MM"));
    }

    public static void main(String[] args) {
        DateOtimiza dateOtimiza = new DateOtimiza();
        String s = dateOtimiza.retornaData("11092001");
        System.out.println(s);

    }
}
