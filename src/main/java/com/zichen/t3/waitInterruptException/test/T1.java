package com.zichen.t3.waitInterruptException.test;

/**
 * @Name: T1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:40:38
 * @Version: 1.0
 **/
public class T1 extends Thread {
    private Object lock;
    T1 (Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        S s = new S();
        s.methodTest(lock);
    }
}