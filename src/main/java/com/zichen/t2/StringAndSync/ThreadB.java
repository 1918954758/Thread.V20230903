package com.zichen.t2.StringAndSync;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 21:47:27
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Service service;
    ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print("BB");
    }
}