package com.zichen.t2.twoStop2;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 22:05:56
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private Service service;
    private Object object;
    ThreadA(Service service, Object object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        service.methodA(object);
    }
}