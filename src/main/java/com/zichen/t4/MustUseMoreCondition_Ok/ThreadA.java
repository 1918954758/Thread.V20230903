package com.zichen.t4.MustUseMoreCondition_Ok;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/02 21:38:04
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private MyService service;
    ThreadA (MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}