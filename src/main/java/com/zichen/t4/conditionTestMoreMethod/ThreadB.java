package com.zichen.t4.conditionTestMoreMethod;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/02 00:23:53
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private MyService service;
    ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}