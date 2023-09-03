package com.zichen.localDate;

import java.time.*;

/**
 * @Name: RunatTime
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 12:17:28
 * @Version: 1.0
 **/
public class RunatTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // hour and minute
        LocalDateTime localDateTime1 = localDate.atTime(16, 50);
        System.out.println(localDateTime1);

        // hour, minute and second
        LocalDateTime localDateTime2 = localDate.atTime(12, 19, 45);
        System.out.println(localDateTime2);

        // hour, minute, second and nanoOfSecond
        LocalDateTime localDateTime3 = localDate.atTime(12, 19, 45, 400);
        System.out.println(localDateTime3);

        // using LocalTime
        LocalDateTime localDateTime4 = localDate.atTime(LocalTime.now());
        System.out.println(localDateTime4);

        // using OffsetTime
        OffsetDateTime offsetDateTime5 = localDate.atTime(OffsetTime.now());
        System.out.println(offsetDateTime5);
    }
}