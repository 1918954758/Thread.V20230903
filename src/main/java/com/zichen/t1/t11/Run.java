package com.zichen.t1.t11;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 14:36:35
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            Mythread mythread = new Mythread();
            mythread.start();
            Thread.sleep(2000);
            mythread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}