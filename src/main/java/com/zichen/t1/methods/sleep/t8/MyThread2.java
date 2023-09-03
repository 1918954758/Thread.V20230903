package com.zichen.t1.methods.sleep.t8;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 14:02:07
 * @Version: 1.0
 **/
public class MyThread2 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run threadName = " + this.getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName = " + this.getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}