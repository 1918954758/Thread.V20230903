package com.zichen.t1.useStopMethodThread;

/**
 * @Name: MyThread
 * @Description: stop  暴力停止线程
 * @User: xdSun
 * @Date: 2023/04/09 17:06:02
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    private int i = 0;
    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println(" i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}