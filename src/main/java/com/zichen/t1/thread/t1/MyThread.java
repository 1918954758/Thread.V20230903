package com.zichen.t1.thread.t1;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/08 23:54:56
 * @Version: 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
//        super.run();
//        System.out.println(ThreadA.currentThread().getName() + "运行结束");
        int time = (int) (Math.random() * 1000);
        try {
            Thread.sleep(time);
            System.out.println("run = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}