package com.zichen.t1.t14_1;

/**
 * @Name: MyThread
 * @Description: 在 sleep() 中停止线程
 * @User: xdSun
 * @Date: 2023/04/09 16:50:19
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 200000; i++) {
                System.out.println(" i = " + (i + 1));
            }
            System.out.println(" run begin");
            Thread.sleep(200000);
            System.out.println(" run end");
        } catch (InterruptedException e) {
            System.out.println(" 在沉睡中被停止！进入catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}