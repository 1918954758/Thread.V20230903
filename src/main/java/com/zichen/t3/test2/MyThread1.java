package com.zichen.t3.test2;

/**
 * @Name: MyThread1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:19:40
 * @Version: 1.0
 **/
public class MyThread1 extends Thread {
    private Object lock;
    MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println(" 开始     wait time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println(" 结束      wait time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}