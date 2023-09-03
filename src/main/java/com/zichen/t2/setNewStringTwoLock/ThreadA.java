package com.zichen.t2.setNewStringTwoLock;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:24:07
 * @Version: 1.0
 **/
public class ThreadA extends Thread{
    private MyService service;
    ThreadA(MyService service) {
        this.service =service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}