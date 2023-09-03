package com.zichen.t2.volatileKeyWord.atomicIntegerNoSafe;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 14:22:03
 * @Version: 1.0
 **/
public class MyThread extends Thread {
    private MyService service;
    MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.addNum();
    }
}