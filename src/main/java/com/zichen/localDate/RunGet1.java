package com.zichen.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;
import java.time.temporal.ChronoField;

/**
 * @Name: RunGet1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 11:56:33
 * @Version: 1.0
 **/
public class RunGet1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int val = localDate.get(ChronoField.YEAR);
        System.out.println(val);
    }
}
class RunGet2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        IsoChronology chronology = localDate.getChronology();
        System.out.println(chronology);
    }
}
class RunGet3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int val = localDate.getDayOfMonth();
        System.out.println(val);
    }
}
class RunGet4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
class RunGet5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);
    }
}
class RunGet6 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        IsoEra era = localDate.getEra();
        System.out.println(era);
    }
}
class RunGet7 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        long year = localDate.getLong(ChronoField.YEAR);
        long aLong = localDate.getLong(ChronoField.MONTH_OF_YEAR);
        long aLong1 = localDate.getLong(ChronoField.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(aLong);
        System.out.println(aLong1);
    }
}
class RunGet8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        Month month = localDate.getMonth();
        System.out.println(month);
    }
}
class RunGet9 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int month = localDate.getMonthValue();
        System.out.println(month);
    }
}
class RunGet10 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int year = localDate.getYear();
        System.out.println(year);
    }
}