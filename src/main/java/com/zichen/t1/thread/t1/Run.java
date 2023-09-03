package com.zichen.t1.thread.t1;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/08 23:56:07
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("MyThread");
        mt.start();
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }
}