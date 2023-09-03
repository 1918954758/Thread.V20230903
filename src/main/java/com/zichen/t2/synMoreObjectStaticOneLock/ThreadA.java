package com.zichen.t2.synMoreObjectStaticOneLock;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 19:12:19
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private Service service;
    ThreadA(Service service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.printA();
    }
}