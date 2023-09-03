package com.zichen.t2.syncOneThreadIn;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 11:50:59
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private ObjectService objectService;
    public ThreadB(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}