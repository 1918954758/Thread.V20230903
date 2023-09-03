package com.zichen.t4.MustUseMoreCondition_Error;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/02 21:14:08
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private MyService service;
    ThreadB (MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}