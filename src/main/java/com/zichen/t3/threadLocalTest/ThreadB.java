package com.zichen.t3.threadLocalTest;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 16:30:57
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Tools.t1.set("ThreadB " + (i + 1));
                System.out.println("ThreadB get Value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}