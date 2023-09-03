package com.zichen.t2.doubleSynBlockOneTwo;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 13:49:12
 * @Version: 1.0
 **/
public class ThreadB extends Thread{
    private ObjectService objectService;
    ThreadB(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        objectService.serviceMethodB();
    }
}