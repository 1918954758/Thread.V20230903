package com.zichen.t1.methods.isalive.t7;

/**
 * @Name: MyThread
 * @Description: isAlive() 判断当前的线程是否处于活动状态
 * @User: xdSun
 * @Date: 2023/04/09 13:51:27
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}