package com.zichen.t3.joinException;

/**
 * @Name: ThreadC
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 12:28:13
 * @Version: 1.0
 **/
public class ThreadC extends Thread {
    private ThreadB threadB;
    ThreadC (ThreadB threadB) {
        this.threadB = threadB;
    }
    @Override
    public void run() {
        threadB.interrupt();
    }
}