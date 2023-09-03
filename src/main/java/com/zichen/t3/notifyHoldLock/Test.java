package com.zichen.t3.notifyHoldLock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:27:56
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.setName("A");
        a.start();
        Thread.sleep(2000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.setName("NotifyThread");
        notifyThread.start();
        SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
        synNotifyMethodThread.setName("SynNotifyMethodThread");
        synNotifyMethodThread.start();
    }
}