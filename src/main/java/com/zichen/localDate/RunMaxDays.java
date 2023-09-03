package com.zichen.localDate;

import java.time.LocalDate;

/**
 * @Name: RunMaxDays
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 12:46:25
 * @Version: 1.0
 **/
public class RunMaxDays {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2018-02-18");
        System.out.println(localDate);

        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.lengthOfYear());
    }
}