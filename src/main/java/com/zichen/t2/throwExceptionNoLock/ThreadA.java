package com.zichen.t2.throwExceptionNoLock;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:46:18
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.testMethod();
    }
}