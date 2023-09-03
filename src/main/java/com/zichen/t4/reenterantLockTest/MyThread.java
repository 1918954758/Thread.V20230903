package com.zichen.t4.reenterantLockTest;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/02 00:08:32
 * @Version: 1.0
 **/
public class MyThread extends Thread {
    private MyService myService;
    MyThread (MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}