package com.zichen.t2.synStaticMethod;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 19:12:19
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}