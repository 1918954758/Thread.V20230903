package com.zichen.t3.notifyOne;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:57:14
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Object lock;
    ThreadB (Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}