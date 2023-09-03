package com.zichen.t2.syncMethodLockObject2.syncMethodLockObject;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 22:34:01
 * @Version: 1.0
 **/
public class ThreadA extends Thread{
    private MyObject object;
    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}