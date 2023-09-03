package com.zichen.t4.getWaitQueueLength_Test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/03 20:34:11
 * @Version: 1.0
 **/
public class Service {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition newCondition = lock.newCondition();
    public void waitMethod() {
        try {
            lock.lock();
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void signalMethod() {
        try {
            lock.lock();
            System.out.println("执行newCondition.signal()之前，有 " + lock.getWaitQueueLength(newCondition) + " 个线程正在等待 newCondition 对象获得锁。");
            newCondition.signal();
            System.out.println("执行newCondition.signal()之后，有 " + lock.getWaitQueueLength(newCondition) + " 个线程正在等待 newCondition 对象获得锁。");
        } finally {
            lock.unlock();
        }
    }
}
class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(service::waitMethod);
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.signalMethod();
    }
}