package com.zichen.t3.waitReleaseLock;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 10:27:07
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