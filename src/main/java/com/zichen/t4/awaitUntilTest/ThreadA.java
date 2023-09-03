package com.zichen.t4.awaitUntilTest;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 22:52:54
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private Service service;
    ThreadA (Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}