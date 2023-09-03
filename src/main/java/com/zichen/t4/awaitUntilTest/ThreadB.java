package com.zichen.t4.awaitUntilTest;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 22:54:14
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Service service;
    ThreadB (Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.signalMethod();
    }
}