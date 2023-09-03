package com.zichen.t1.methods.sleep.t8;

/**
 * @Name: MyThread
 * @Description: sleep() 在指定毫秒内让当前“正在执行的线程”休眠（暂停执行）
 * 正在执行的线程：指的是，this.currentThread() 返回的线程
 * @User: xdSun
 * @Date: 2023/04/09 14:02:07
 * @Version: 1.0
 **/
public class MyThread1 extends Thread{
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