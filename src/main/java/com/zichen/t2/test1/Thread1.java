package com.zichen.t2.test1;

/**
 * @Name: Thread1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:47:38
 * @Version: 1.0
 **/
public class Thread1 extends Thread {
    private Service service;
    private MyObject myObject;
    Thread1(Service service, MyObject myObject) {
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        service.testMethod1(myObject);
    }
}