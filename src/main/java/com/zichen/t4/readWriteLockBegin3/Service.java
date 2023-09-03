package com.zichen.t4.readWriteLockBegin3;

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
                Thread.sleep(5000);
            } finally {
                System.out.println(" 释放读锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println(" 获得写锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(5000);
            } finally {
                System.out.println(" 释放写锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}