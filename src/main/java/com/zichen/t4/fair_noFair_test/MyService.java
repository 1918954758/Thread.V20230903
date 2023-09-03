package com.zichen.t4.fair_noFair_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: MyService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/03 19:54:55
 * @Version: 1.0
 **/
public class MyService {
    private Lock lock;
    MyService (boolean isFair) {
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " 获得锁定 ");
        } finally {
            lock.unlock();
        }
    }
}