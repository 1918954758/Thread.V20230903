package com.zichen.t2.throwExceptionNoLock;

/**
 * @Name: a
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:47:26
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.testMethod();
    }
}