package com.zichen.localDate;

import java.time.LocalDate;
import java.time.temporal.Temporal;

/**
 * @Name: RunAdjustInto
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 13:10:17
 * @Version: 1.0
 **/
public class RunAdjustInto {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2011-01-01");
        System.out.println(localDate);

        Temporal temporalObj = LocalDate.parse("2017-03-29");

        temporalObj = localDate.adjustInto(temporalObj);
        System.out.println(temporalObj);
    }
}