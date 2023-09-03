package com.zichen.t2.synStaticMethod;

/**
 * @Name: ThredB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 19:12:37
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}