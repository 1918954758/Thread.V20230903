package com.zichen.localDate;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Stream;

/**
 * @Name: RunDatesUntil
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 12:53:04
 * @Version: 1.0
 **/
public class RunDatesUntil {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.parse("2023-04-15");
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.parse("2023-04-15");
        System.out.println(localDate2);

        System.out.println("----- With LocalDate -----");
        Stream<LocalDate> localDateStream = localDate1.datesUntil(LocalDate.parse("2023-04-18"));
        localDateStream.forEach(System.out::println);

        System.out.println("----- With LocalDate and Period -----");
        Stream<LocalDate> localDateStream1 = localDate2.datesUntil(LocalDate.parse("2023-04-22"), Period.ofDays(2));
        localDateStream1.forEach(System.out::println);
    }
}