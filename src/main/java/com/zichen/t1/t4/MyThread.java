package com.zichen.t1.t4;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 00:53:44
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    private int count = 10;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(" 由 " + this.getName() + " 计算，count = " + count);
    }
}