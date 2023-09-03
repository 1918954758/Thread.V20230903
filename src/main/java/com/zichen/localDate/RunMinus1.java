package com.zichen.localDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @Name: RunMinus1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 11:33:44
 * @Version: 1.0
 **/
public class RunMinus1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.minus(18, ChronoUnit.DAYS);
        System.out.println(localDate1);
    }
}
class RunMinus2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.minus(Period.ofDays(18));
        System.out.println(localDate1);
    }
}
class RunMinus3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = localDate.minusDays(18);
        System.out.println(localDate1);
    }
}