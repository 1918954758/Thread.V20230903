package com.zichen.t4.readWriteLockBegin4;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 09:33:28
 * @Version: 1.0
 **/
public class ThreadB extends Thread{
    private Service service;
    ThreadB (Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}