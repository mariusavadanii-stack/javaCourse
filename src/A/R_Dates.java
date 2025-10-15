package A;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class R_Dates {
    static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalDateTime todayNow = LocalDateTime.now();
        System.out.println(todayNow);

        /*format date and time*/
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = todayNow.format(dateFormat);

        System.out.println("today date and time: " + formattedDate);

    }

}
