package com.zichen.t2.syncOneThreadIn;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 11:49:55
 * @Version: 1.0
 **/
public class ThreadA extends Thread{
    private ObjectService objectService;
    public ThreadA(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}