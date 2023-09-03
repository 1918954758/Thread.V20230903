package com.zichen.t2.test2;

/**
 * @Name: Thread1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:47:38
 * @Version: 1.0
 **/
public class Thread1 extends Thread {
    private Service service;
    Thread1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod2();
    }
}