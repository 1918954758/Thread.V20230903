package com.zichen.t4.test4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 20:55:42
 * @Version: 1.0
 **/
public class Service {
    public ReentrantLock lock;
    Service (boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }
    public void serviceMethod() {
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}