package com.zichen.t2.twoStop;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 22:06:36
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Service service;
    ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}