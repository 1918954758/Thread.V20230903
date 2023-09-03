package com.zichen.t3.waitInterruptException;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:47:53
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        Thread.sleep(5000);
        a.interrupt();
    }
}