package com.zichen.t2.synMoreObjectStaticOneLock;

/**
 * @Name: ThredB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 19:12:37
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Service service;
    ThreadB(Service service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.printB();
    }
}