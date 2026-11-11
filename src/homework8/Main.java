package homework8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Arrays;

public class Main {

    static Date date = new Date();

    static SimpleDateFormat ddMMyyyy = new SimpleDateFormat("dd.MM.yyyy");
    static SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
    static SimpleDateFormat EEEEdMMMMyyyy = new SimpleDateFormat("EEEE, d MMMM yyyy", new Locale("ru"));


    static void main(String[] args) {
        System.out.println(Arrays.toString(printCurrentDate()));
        System.out.println(daysBetween("01.01.2024", "31.12.2024"));
        System.out.println(getDayOfWeek("15.03.2007"));
        System.out.println(addDays("15.03.2007", 2));
        System.out.println(calculateAge("15.03.2007"));
        //6
        Pair<String, Integer> pair1 = new Pair<>("Age", 20);
        System.out.println(pair1);
        //7
        java.lang.Integer[] arr = new Integer[]{65, 137, 45};
        System.out.println(getFirst(arr));
        //8
        printArray(new String[]{"a", "b"});
        printArray(new Integer[]{1, 2, 3});
        //9
        Box<Integer> box = new Box<>();
        System.out.println(box.get());
        Box<String> boxStr = new Box<>();
        System.out.println(boxStr.get());
        //10
        System.out.println(sumOfList(List.of(1, 3, 5)));

    }

    public static String[] printCurrentDate() {
        return new String[]{
                ddMMyyyy.format(date),
                yyyyMMdd.format(date),
                EEEEdMMMMyyyy.format(date)

        };
    }

    public static long daysBetween(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate d1 = LocalDate.parse(date1, formatter);
        LocalDate d2 = LocalDate.parse(date2, formatter);

      return ChronoUnit.DAYS.between(d1, d2);

    }


    public static String getDayOfWeek(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate d = LocalDate.parse(date, formatter);

        String val = d.format(DateTimeFormatter.ofPattern("EEEE", new Locale("ru")));

        return val;
    }

    public static String addDays(String date, int days) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate d = LocalDate.parse(date, formatter);
        String val = d.plusDays(days).format(formatter);
        return val;
    }

    public static String calculateAge(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate d = LocalDate.parse(birthDate, formatter);
        LocalDate currentDate = LocalDate.now();
        int dif = Period.between(d, currentDate).getYears();
        return String.valueOf(dif);
    }

    public static <T> T getFirst(T[] array) {
        if (array == null) {
            return null;
        }
        return array[0];
    }

    public static <T> void printArray(T[] array) {
        for (T i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }


}
