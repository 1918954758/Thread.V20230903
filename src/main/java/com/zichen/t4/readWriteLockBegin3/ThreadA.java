package com.zichen.t4.readWriteLockBegin3;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 09:32:40
 * @Version: 1.0
 **/
public class ThreadA extends Thread{
    private Service service;
    ThreadA (Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}