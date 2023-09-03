package com.zichen.t4.test8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 21:42:32
 * @Version: 1.0
 **/
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("      " + Thread.currentThread().getName() + " 获得锁定的时间：" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println("      " + Thread.currentThread().getName() + " 没有获得锁 " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}