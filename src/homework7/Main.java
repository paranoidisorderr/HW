package homework7;


import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Date;
import java.util.Locale;

public class Main {

    static Date date = new Date();

    static SimpleDateFormat ddMMyyyy = new SimpleDateFormat("dd.MM.yyyy");
    static SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
    static SimpleDateFormat EEEEdMMMMyyyy = new SimpleDateFormat("EEEE, d MMMM yyyy", new Locale("ru"));


    static void main(String[] args) {
        printCurrentDate();
    }

    public static String[] printCurrentDate() {
        return new String[]{
                ddMMyyyy.format(date),
                yyyyMMdd.format(date),
                EEEEdMMMMyyyy.format(date)

        };
    }

}
