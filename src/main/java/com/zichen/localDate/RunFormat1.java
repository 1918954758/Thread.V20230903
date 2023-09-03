package com.zichen.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Name: RunFormat1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 12:11:06
 * @Version: 1.0
 **/
public class RunFormat1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        String format = localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
        System.out.println(format);
    }
}