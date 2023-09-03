package com.zichen.t3.test2;

/**
 * @Name: MyThread2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:22:09
 * @Version: 1.0
 **/
public class MyThread2 extends Thread {
    private Object lock;
    MyThread2 (Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(" 开始 notify time = " + System.currentTimeMillis());
            lock.notify();
            System.out.println(" 结束 notify time = " + System.currentTimeMillis());
        }
    }
}