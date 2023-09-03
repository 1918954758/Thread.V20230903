package com.zichen.t3.join_sleep_3;

/**
 * @Name: ThreadC
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 13:03:57
 * @Version: 1.0
 **/
public class ThreadC extends Thread {
    private ThreadA a;
    private ThreadB b;
    ThreadC (ThreadA a, ThreadB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        b.bService(a);
    }
}