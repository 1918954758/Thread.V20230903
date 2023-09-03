package com.zichen.localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Name: RunAtStartOfDay
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 12:29:19
 * @Version: 1.0
 **/
public class RunAtStartOfDay {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        LocalDateTime localDateTime = localDate.atStartOfDay();
        System.out.println(localDateTime);
    }
}