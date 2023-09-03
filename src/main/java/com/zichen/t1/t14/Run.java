package com.zichen.t1.t14;

/**
 * @Name: Test
 * @Description: 在沉睡中停止线程
 * @User: xdSun
 * @Date: 2023/04/09 16:52:20
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println(" main catch");
            throw new RuntimeException(e);
        }
        System.out.println(" end!");
    }
}