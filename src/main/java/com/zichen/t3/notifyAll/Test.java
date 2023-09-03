package com.zichen.t3.notifyAll;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 12:09:26
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(lock);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(lock);
        c.setName("C");
        c.start();
        Thread.sleep(5000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.setName("NotifyThread");
        notifyThread.start();
    }
}