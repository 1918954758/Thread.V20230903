package com.zichen.t2.t9;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:26:42
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.start();
        MyThread2 thread2 = new MyThread2(list);
        thread2.start();
        Thread.sleep(5000);
        System.out.println("list.size() = " + list.getSize());
    }
}