package com.zichen.t1.thread.z;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 00:26:18
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    private int i;
    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}