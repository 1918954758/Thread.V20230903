package com.zichen.t3.waitInterruptException.test;

/**
 * @Name: S
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 11:39:08
 * @Version: 1.0
 **/
public class S {
    public void methodTest(Object lock) {
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