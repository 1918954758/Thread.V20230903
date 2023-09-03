package com.zichen.t3.waitInterruptException;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:44:57
 * @Version: 1.0
 **/
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("end   wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}