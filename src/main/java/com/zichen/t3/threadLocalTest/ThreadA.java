package com.zichen.t3.threadLocalTest;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 16:29:16
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Tools.t1.set("ThreadA " + (i + 1));
                System.out.println("ThreadA get Value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}