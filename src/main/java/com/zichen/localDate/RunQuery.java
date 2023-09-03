package com.zichen.localDate;

import java.time.LocalDate;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalUnit;

/**
 * @Name: RunQuery
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 13:15:27
 * @Version: 1.0
 **/
public class RunQuery {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        TemporalUnit query = localDate.query(TemporalQueries.precision());
        System.out.println(query);
    }
}