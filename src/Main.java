import java.time.LocalDate;
import java.time.Year;

/*
Date-Time 01
Exercise: Date Time 1
using LocaleDate, calculate and print:
how many days are left till the end of the month
how many days are left till the end of the year, using the length() method from java.time.Year.of()
 */
public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.printf(
                "Missing days at the end of the month: %d%n",(
                        date.lengthOfMonth() - date.getDayOfMonth()
                )
        );
        /*
        System.out.printf(
                "Missing days at the end of the year: %d%n",(
                        date.lengthOfYear() - date.getDayOfYear()
                )
        );
        */

        Year year = Year.of(date.getYear());
        System.out.printf(
                "Missing days at the end of the year: %d%n",(
                        year.length() - date.getDayOfYear()
                )
        );

    }
}
