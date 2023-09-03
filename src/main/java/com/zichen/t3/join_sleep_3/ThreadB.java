package com.zichen.t3.join_sleep_3;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 13:01:39
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("  b run begin timer = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  b run end   timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void bService(ThreadA a) {
        synchronized (a) {
            System.out.println(" 打印了 bService timer = " + System.currentTimeMillis());
        }
    }
}