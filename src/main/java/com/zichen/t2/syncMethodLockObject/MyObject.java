package com.zichen.t2.syncMethodLockObject;

/**
 * @Name: MyObject
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 22:32:28
 * @Version: 1.0
 **/
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}