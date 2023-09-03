package com.zichen.t1.useReturnInterrupt;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 17:55:58
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            System.out.println(" run begin");
            Thread.sleep(100);
            thread.interrupt();
            System.out.println(" run end");
        } catch (InterruptedException e) {
            System.out.println("线程终止了");
            e.printStackTrace();
        }
    }
}