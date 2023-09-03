package com.zichen.t4.test3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 20:49:14
 * @Version: 1.0
 **/
public class Service {
    public ReentrantLock lock;
    Service (boolean isFair) {
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println(" 公平锁情况：" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}