package com.zichen.t2.test1;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:46:02
 * @Version: 1.0
 **/
public class Service {
    public void testMethod1(MyObject object) {
        synchronized(object) {
            try {
                System.out.println("testMethod1 ____getLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}