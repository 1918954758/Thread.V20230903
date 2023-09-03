package com.zichen.t1.t12;

/**
 * @Name: Test
 * @Description: isInterrupted() 判断线程是否已经中断，但是不清楚中断标志
 * @User: xdSun
 * @Date: 2023/04/09 14:55:58
 * @Version: 1.0
 **/
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println(" 是否停止1？ = " + myThread.isInterrupted());
            System.out.println(" 是否停止2？ = " + myThread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}