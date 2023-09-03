package com.zichen.t3.notifyHoldLock;

/**
 * @Name: NotifyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:22:33
 * @Version: 1.0
 **/
public class NotifyThread extends Thread {
    private Object lock;
    NotifyThread (Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}