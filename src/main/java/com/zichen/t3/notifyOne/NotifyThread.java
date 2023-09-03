package com.zichen.t3.notifyOne;

/**
 * @Name: NotifyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 12:07:30
 * @Version: 1.0
 **/
public class NotifyThread extends Thread {
    private Object lock;
    NotifyThread (Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
        }
    }
}