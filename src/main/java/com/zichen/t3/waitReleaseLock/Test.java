package com.zichen.t3.waitReleaseLock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 10:27:45
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.setName("A");
        a.start();
        Thread.sleep(2000);
        ThreadB b = new ThreadB(lock);
        b.setName("B");
        b.start();
    }
}