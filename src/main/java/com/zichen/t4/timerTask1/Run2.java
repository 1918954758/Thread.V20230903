package com.zichen.t4.timerTask1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Name: Run2
 * @Description: 进程结束，守护线程也立即结束，不再执行 task
 * @User: xdSun
 * @Date: 2023/05/19 10:14:41
 * @Version: 1.0
 **/
public class Run2 {
    private static final Timer timer = new Timer(true);
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println(" 运行了！ 时间为： " + new Date());
        }
    }
    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2023-05-19 10:19:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println(" 字符串时间： " + dateRef.toLocaleString() + " 当前时间： " + new Date().toLocaleString());
            timer.schedule(task, dateRef);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}