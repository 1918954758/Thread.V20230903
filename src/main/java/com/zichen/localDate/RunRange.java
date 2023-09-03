package com.zichen.localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

/**
 * @Name: RunRange
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 13:18:05
 * @Version: 1.0
 **/
public class RunRange {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023-02-19");
        System.out.println(localDate);

        ValueRange vrange = localDate.range(ChronoField.DAY_OF_MONTH);
        System.out.println(vrange);

        vrange = localDate.range(ChronoField.DAY_OF_WEEK);
        System.out.println(vrange);
    }
}