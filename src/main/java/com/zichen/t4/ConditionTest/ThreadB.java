package com.zichen.t4.ConditionTest;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/03 00:55:34
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private MyService service;
    ThreadB (MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            service.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}