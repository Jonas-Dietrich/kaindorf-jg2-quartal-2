package bl;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormaterBL {

    public String format(String formatStr, int... values) {
        String txt = "";

        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dtfDateAndTime = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm");
        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm");

        switch (formatStr) {
            case "D":
                LocalDate date = LocalDate.of(values[2], values[1], values[0]);
                txt = date.format(dtfDate);
                break;
            case "DT":
                LocalDateTime dateAndTime = LocalDateTime.of(values[2], values[1], values[0], values[3], values[4]);
                txt = dateAndTime.format(dtfDateAndTime);
                break;
            case "T":
                LocalTime time = LocalTime.of(values[3], values[4]);
                txt += time.format(dtfTime);
                break;
        }

        return txt;
    }
}
