package com.zichen.t1.t13_1;

/**
 * @Name: Test
 * @Description: 异常停止线程法
 * @User: xdSun
 * @Date: 2023/04/09 15:45:24
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(500);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            throw new RuntimeException(e);
        }
        System.out.println(" end!");
    }
}