package com.zichen.t3.notifyAll;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:56:04
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private Object lock;
    ThreadA (Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}