package com.zichen.t2.syncOneThreadIn;

/**
 * @Name: ObjectService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 11:45:32
 * @Version: 1.0
 **/
public class ObjectService {
    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time = " + System.currentTimeMillis() + " threadName = " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("end   time = " + System.currentTimeMillis() + " threadName = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}