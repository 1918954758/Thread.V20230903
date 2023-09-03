package com.zichen.localDate;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @Name: RunLocalDateIsEqual
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 12:34:33
 * @Version: 1.0
 **/
public class RunLocalDateIsEqual1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
    }
}
class RunLocalDateIsEqual2 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.parse("2023-03-18");
        LocalDate localDate2 = LocalDate.parse("2023-04-18");
        System.out.println(localDate1);
        System.out.println(localDate2);

        System.out.println(localDate1.isAfter(localDate2));
        System.out.println(localDate1.isBefore(localDate2));
        System.out.println(localDate1.isEqual(localDate2));
    }
}