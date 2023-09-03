package com.zichen.t3.waitInterruptException.test;

/**
 * @Name: RunT
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:42:37
 * @Version: 1.0
 **/
public class RunT {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        T1 t = new T1(lock);
        t.start();
        Thread.sleep(5000);
        t.interrupt();
    }
}