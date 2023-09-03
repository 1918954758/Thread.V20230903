package com.zichen.t4.test7;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 21:37:49
 * @Version: 1.0
 **/
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " 获得锁定。");
        } else {
            System.out.println(Thread.currentThread().getName() + " 没有获得锁定。");
        }
    }
}