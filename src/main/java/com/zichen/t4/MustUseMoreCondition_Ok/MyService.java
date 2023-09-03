package com.zichen.t4.MustUseMoreCondition_Ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: MyService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/02 21:32:40
 * @Version: 1.0
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA 时间为 = " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end   awaitA 时间为 = " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB 时间为 = " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end   awaitB 时间为 = " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void signalAll_A() {
        try {
            lock.lock();
            System.out.println("   signalAll 时间为 = " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }
    public void signalAll_B() {
        try {
            lock.lock();
            System.out.println("   signalAll 时间为 = " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }
}