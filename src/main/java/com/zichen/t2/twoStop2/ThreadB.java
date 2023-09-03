package com.zichen.t2.twoStop2;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 22:06:36
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Service service;
    private Object object;
    ThreadB(Service service, Object object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        service.methodB(object);
    }
}