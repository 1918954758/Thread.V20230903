package com.zichen.t2.synTwoLock;

/**
 * @Name: ThredB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 19:12:37
 * @Version: 1.0
 **/
public class ThreadC extends Thread {
    private Service service;
    ThreadC(Service service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.printC();
    }
}