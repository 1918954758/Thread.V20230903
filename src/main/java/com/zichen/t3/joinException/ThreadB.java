package com.zichen.t3.joinException;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 12:26:42
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println(" 线程 B 在 run end 处打印了");
        } catch (InterruptedException e) {
            System.out.println(" 线程 B 在 catch 处打印了");
            e.printStackTrace();
        }
    }
}