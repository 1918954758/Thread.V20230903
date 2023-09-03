package com.zichen.t4.ConditionTestManyToMany_ManyCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: MyService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/03 00:49:26
 * @Version: 1.0
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private boolean hasValue = false;
    public void set() {
        try {
            lock.lock();
            while (hasValue) {
                System.out.println(" 有可能 ★ ★ 连续打印");
                condition1.await();
            }
            System.out.println(" 打印 ★ ");
            hasValue = true;
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void get() {
        try {
            lock.lock();
            while (!hasValue) {
                System.out.println(" 有可能 ☆ ☆ 连续打印");
                condition2.await();
            }
            System.out.println(" 打印 ☆ ");
            hasValue = false;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}