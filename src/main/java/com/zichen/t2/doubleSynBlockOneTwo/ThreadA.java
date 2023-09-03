package com.zichen.t2.doubleSynBlockOneTwo;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 13:48:23
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private ObjectService objectService;
    ThreadA(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        objectService.serviceMethodA();
    }
}