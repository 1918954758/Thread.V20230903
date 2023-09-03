package com.zichen.t1.useStopMethodThread;

/**
 * @Name: Test
 * @Description: 测试暴力停止线程
 * @User: xdSun
 * @Date: 2023/04/09 17:07:36
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}