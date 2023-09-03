package com.zichen.localDate;

import java.time.LocalDate;
import java.time.Period;

/**
 * @Name: RunDatesIsNumber
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 13:01:19
 * @Version: 1.0
 **/
public class RunDatesIsNumber {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023-02-15");
        System.out.println(localDate);

        Period period = localDate.until(LocalDate.parse("2023-05-25"));
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}