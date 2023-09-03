package com.zichen.t1.t13_1;

/**
 * @Name: MyThread
 * @Description: 异常法中断线程
 * @User: xdSun
 * @Date: 2023/04/09 15:43:43
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 1; i <= 500000; i++) {
                if (Thread.interrupted()) {
                    System.out.println(" 已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i = " + i);
            }
            System.out.println(" 我在for下面的循环");
        } catch (InterruptedException e) {
            System.out.println(" 进MyThread.jav类 run 方法中的catch了！");
            e.printStackTrace();
        }
    }
}