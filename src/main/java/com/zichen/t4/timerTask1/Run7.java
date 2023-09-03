package com.zichen.t4.timerTask1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Name: Run7
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 14:50:26
 * @Version: 1.0
 **/
public class Run7 {
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println(" 运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse("2023-05-19 14:56:00");
            System.out.println(" 字符串时间为：" + date.toLocaleString() + " 当前时间为：" + new Date().toString());

            new Timer().schedule(task, date, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}