package com.zichen.t2.syncMethodLockObject2.syncMethodLockObject;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 22:35:24
 * @Version: 1.0
 **/
public class ThreadB extends Thread{
    private MyObject object;
    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}