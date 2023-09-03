package com.zichen.t3.join_sleep_1;

/**
 * @Name: ThreadC
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 13:03:57
 * @Version: 1.0
 **/
public class ThreadC extends Thread {
    private ThreadB b;
    ThreadC (ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        b.bService();
    }
}