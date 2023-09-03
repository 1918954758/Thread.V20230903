package com.zichen.localDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;

/**
 * @Name: RunToEpochDayAndSecond
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 13:24:28
 * @Version: 1.0
 **/
public class RunToEpochDayAndSecond {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023-05-19");
        System.out.println(localDate);

        long l = localDate.toEpochDay();
        System.out.println(l);
        long l1 = localDate.toEpochSecond(LocalTime.now(), ZoneOffset.MAX);
        System.out.println(l1);
    }
}