package com.zichen.t1.t14;

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
            System.out.println(" run begin");
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            System.out.println(" 在沉睡中被停止！进入catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}