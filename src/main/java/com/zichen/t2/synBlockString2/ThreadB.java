package com.zichen.t2.synBlockString2;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 16:03:18
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Service service;
    ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}