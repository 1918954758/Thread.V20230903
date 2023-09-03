package com.zichen.t3.notifyHoldLock;

/**
 * @Name: SynNotifyMethodTread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:25:28
 * @Version: 1.0
 **/
public class SynNotifyMethodThread extends Thread{
    private Object lock;
    SynNotifyMethodThread(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}