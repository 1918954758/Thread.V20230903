package com.zichen.t4.timerTask1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Name: Run6
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 14:32:10
 * @Version: 1.0
 **/
public class Run6 {
    private static Timer timer = new Timer();
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("1 begin 运行了！时间为：" + new Date());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("1 end   运行了！时间为：" + new Date());
        }
    }
    static public class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("2 begin 运行了！时间为：" + new Date());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("2 end   运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            MyTask2 task2 = new MyTask2();

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date date1 = sdf1.parse("2023-05-19 14:40:00");
            Date date2 = sdf1.parse("2023-05-19 14:40:08");

            System.out.println(" 字符串 1 时间：" + date1.toString() + " 当前时间：" + new Date());
            System.out.println(" 字符串 2 时间：" + date2.toString() + " 当前时间：" + new Date());

            timer.schedule(task1, date1);
            timer.schedule(task2, date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}