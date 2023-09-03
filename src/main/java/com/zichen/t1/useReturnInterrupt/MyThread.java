package com.zichen.t1.useReturnInterrupt;

/**
 * @Name: MyThread
 * @Description: interrupt() 配合return 中断线程
 * @User: xdSun
 * @Date: 2023/04/09 17:54:10
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    private int i = 0;
    @Override
    public void run() {
        for (;;) {
            if (Thread.interrupted()) {
                System.out.println(" 停止信号配合return把我停止了！");
                return;
            }
            System.out.println(" i = " + (++i));
        }
    }
}