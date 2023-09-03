package com.zichen.localDate;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @Name: Run1
 * @Description: LocalDate 初始化
 * @User: xdSun
 * @Date: 2023/05/19 10:58:23
 * @Version: 1.0
 **/
class Run1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
class Run2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(Clock.systemUTC());
        System.out.println(localDate);
    }
}
class Run3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
        System.out.println(localDate);
    }
}
class Run4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 05, 19);
        System.out.println(localDate);
    }
}
class Run5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, Month.MAY, 19);
        System.out.println(localDate);
    }
}
class Run6 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.ofEpochDay(19496);
        System.out.println(localDate);
    }
}
class Run7 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(localDate);
    }
}
class Run8 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.ofYearDay(2023, 139);
        System.out.println(localDate);
    }
}
class Run9 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023-05-19");
        System.out.println(localDate);
    }
}
class Run10 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023:05:19", DateTimeFormatter.ofPattern("yyyy:MM:dd"));
        System.out.println(localDate);
    }
}
class Run11 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.from(LocalDate.now());
        System.out.println(localDate);
    }
}