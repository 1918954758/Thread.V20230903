package com.zichen.t3.ThreadLocal33;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 16:56:39
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(" 在 ThreadA 线程中取值 = " + Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}