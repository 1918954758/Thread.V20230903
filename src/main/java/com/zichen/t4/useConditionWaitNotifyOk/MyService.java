package com.zichen.t4.useConditionWaitNotifyOk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: MyService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/02 20:15:32
 * @Version: 1.0
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await() {
        try {
            lock.lock();
            System.out.println(" await 时间为 = " + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("await() unlock 时间为 = " + System.currentTimeMillis());
            lock.unlock();
        }
    }
    public void signal() {
        try {
            lock.lock();
            System.out.println("signal 时间为 = " + System.currentTimeMillis());
            condition.signal();
        } finally {
            System.out.println("signal unlock 时间为 = " + System.currentTimeMillis());
            lock.unlock();
        }
    }
}