package com.zichen.t1.t18;

/**
 * @Name: MyThread1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 21:34:27
 * @Version: 1.0
 **/
public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1 run priority = " + this.getPriority());
        MyThread2 thread = new MyThread2();
        thread.start();
    }
}