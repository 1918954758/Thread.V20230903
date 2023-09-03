package com.zichen.t1.t13;

/**
 * @Name: Test
 * @Description: 中断标志法（不完全中断，只是跳出一个循环，如果有多个循环那么线程还是可以执行）
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
            throw new RuntimeException(e);
        }
    }
}