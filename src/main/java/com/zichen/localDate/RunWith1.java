package com.zichen.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

/**
 * @Name: RunWith
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 11:42:06
 * @Version: 1.0
 **/
public class RunWith1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.with(DayOfWeek.MONDAY);
        System.out.println(localDate1);
    }
}
class RunWith2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.with(ChronoField.YEAR, 2015);
        System.out.println(localDate1);
    }
}
class RunWith3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.withDayOfMonth(11);
        System.out.println(localDate1);
    }
}
class RunWith4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.withDayOfYear(129);
        System.out.println(localDate1);
    }
}
class RunWith5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.withMonth(8);
        System.out.println(localDate1);
    }
}
class RunWith6 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.withYear(2016);
        System.out.println(localDate1);
    }
}