package com.zichen.localDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @Name: Run2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 11:22:49
 * @Version: 1.0
 **/
public class RunPlus1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.plus(14, ChronoUnit.DAYS);
        System.out.println(localDate1);
    }
}
class RunPlus2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.plus(Period.ofDays(14));
        System.out.println(localDate1);
    }
}
class RunPlus3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.plusDays(14);
        System.out.println(localDate1);
    }
}