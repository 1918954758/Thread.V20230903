package com.zichen.localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @Name: RunIsSupported
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 12:42:34
 * @Version: 1.0
 **/
public class RunIsSupported {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023-05-11");
        System.out.println(localDate);

        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.isSupported(ChronoField.DAY_OF_MONTH));
        System.out.println(localDate.isSupported(ChronoUnit.HOURS));
    }
}