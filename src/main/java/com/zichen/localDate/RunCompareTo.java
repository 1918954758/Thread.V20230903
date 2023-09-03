package com.zichen.localDate;

import java.time.LocalDate;

/**
 * @Name: RunCompareTo
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 13:06:54
 * @Version: 1.0
 **/
public class RunCompareTo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2018-02-18");
        System.out.println(localDate);

        System.out.println(localDate.compareTo(LocalDate.parse("2018-02-17")));
        System.out.println(localDate.compareTo(LocalDate.parse("2018-02-20")));

        System.out.println(localDate.equals(LocalDate.parse("2018-02-18")));
        System.out.println(localDate.equals(LocalDate.parse("2018-02-25")));
    }
}