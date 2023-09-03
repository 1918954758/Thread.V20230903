package com.zichen.t2.setNewStringTwoLock;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:25:05
 * @Version: 1.0
 **/
public class ThreadB extends Thread{
    private MyService service;
    ThreadB(MyService service) {
        this.service =service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}