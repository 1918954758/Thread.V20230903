package com.zichen.t4.test9;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 22:11:03
 * @Version: 1.0
 **/
public class MyThread extends Thread {
    private Service service;
    MyThread (Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}