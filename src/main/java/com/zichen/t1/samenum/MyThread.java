package com.zichen.t1.samenum;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 11:57:49
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    private int i = 5;

    @Override
    public void run() {
        println(i--);
    }

    synchronized private void println(int i) {
        System.out.println("i = " + i + " threadName = " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}