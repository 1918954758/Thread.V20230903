package com.zichen.t4.readWriteLockBegin2;

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
    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println(" 获得写锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(5000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}