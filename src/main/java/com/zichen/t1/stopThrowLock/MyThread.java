package com.zichen.t1.stopThrowLock;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 17:40:53
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    private SynchronizedObject object;
    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }
    @Override
    public void run() {
        object.printString("b", "bb");
    }
}