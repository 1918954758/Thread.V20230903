package com.zichen.t3.notifyAll;

/**
 * @Name: ThreadC
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 12:06:19
 * @Version: 1.0
 **/
public class ThreadC extends Thread {
    private Object lock;
    ThreadC (Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}