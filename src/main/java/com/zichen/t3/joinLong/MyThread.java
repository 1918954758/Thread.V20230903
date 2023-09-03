package com.zichen.t3.joinLong;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 12:38:05
 * @Version: 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin Timer = " + System.currentTimeMillis() + " - " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end   Timer = " + System.currentTimeMillis() + " - " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}