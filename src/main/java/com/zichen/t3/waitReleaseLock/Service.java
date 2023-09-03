package com.zichen.t3.waitReleaseLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 10:23:41
 * @Version: 1.0
 **/
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " begin wait()");
//                lock.wait();
                Thread.sleep(40000);
                System.out.println(Thread.currentThread().getName() + " end   wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}