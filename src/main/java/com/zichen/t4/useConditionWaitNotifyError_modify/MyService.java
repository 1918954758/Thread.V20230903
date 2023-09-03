package com.zichen.t4.useConditionWaitNotifyError_modify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: MyService
 * @Description: 正确写法
 * @User: xdSun
 * @Date: 2023/05/02 19:54:18
 * @Version: 1.0
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await() {
        try {
            lock.lock();
            System.out.println("lock.lock() after ");
            System.out.println("condition.await() before ");
            condition.await();
            System.out.println("condition.await() after ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("lock.unlock() before ");
            lock.unlock();
        }
    }
}