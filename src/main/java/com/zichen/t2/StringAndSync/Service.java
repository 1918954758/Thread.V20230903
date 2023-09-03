package com.zichen.t2.StringAndSync;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 21:44:41
 * @Version: 1.0
 **/
public class Service {
    public static void print(String stringParam) {
        try {
            synchronized(stringParam) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}