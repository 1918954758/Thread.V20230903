package com.zichen.t2.test3;

/**
 * @Name: Thread2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:49:38
 * @Version: 1.0
 **/
public class Thread2 extends Thread {
    private Service service;
    Thread2(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod2();
    }
}