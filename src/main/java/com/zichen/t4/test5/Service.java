package com.zichen.t4.test5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 21:00:09
 * @Version: 1.0
 **/
public class Service {
    public ReentrantLock lock;
    Service (boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }
    public void serviceMethod() {
        try {
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}