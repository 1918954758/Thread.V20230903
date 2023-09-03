package com.zichen.t2.t8;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 14:02:09
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        Thread.sleep(20);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}