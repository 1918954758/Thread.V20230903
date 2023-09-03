package com.zichen.t1.t18;

/**
 * @Name: MyTreadh
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 21:35:11
 * @Version: 1.0
 **/
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority = " + this.getPriority());
    }
}