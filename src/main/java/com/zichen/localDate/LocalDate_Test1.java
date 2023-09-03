package com.zichen.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Name: LocalDate_Test1
 * @Description: 获取当前日期（手动指定某一时间）
 * @User: xdSun
 * @Date: 2023/05/19 10:47:43
 * @Version: 1.0
 **/
public class LocalDate_Test1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 05, 19);
        System.out.println(localDate);

        /**
         * 将 LocalDate 打印成某一种格式
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String format = localDate.format(dtf);
        String format2 = localDate.format(DateTimeFormatter.ofPattern("yyyy, MMM, dd"));
        System.out.println(format);
        System.out.println(format2);
    }
}