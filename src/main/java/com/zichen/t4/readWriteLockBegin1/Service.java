package com.zichen.t4.readWriteLockBegin1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/19 09:29:35
 * @Version: 1.0
 **/
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println(" 获得读锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}