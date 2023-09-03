package com.zichen.t4.timerTask1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Name: Run4
 * @Description: 多个 TimerTask 任务及延时的测试
 * @User: xdSun
 * @Date: 2023/05/19 10:30:42
 * @Version: 1.0
 **/
public class Run4 {
    private static final Timer timer = new Timer();
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println(" 运行了！ 时间为： " + new Date());
        }
    }
    static public class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println(" 运行了！时间为： " + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            MyTask2 task2 = new MyTask2();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2023-05-19 10:39:00";
            String dateString2 = "2023-05-19 10:40:00";
            Date dateRef1 = sdf1.parse(dateString1);
            Date dateRef2 = sdf2.parse(dateString2);
            System.out.println(" 字符串 1 时间：" + dateRef1.toLocaleString() + " 当前时间： " + new Date());
            System.out.println(" 字符串 2 时间：" + dateRef2.toLocaleString() + " 当前时间： " + new Date());
            timer.schedule(task1, dateRef1);
            timer.schedule(task2, dateRef2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}