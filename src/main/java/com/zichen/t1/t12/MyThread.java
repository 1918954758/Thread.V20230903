package com.zichen.t1.t12;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 14:55:05
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i = " + (i + 1));
        }
    }
}