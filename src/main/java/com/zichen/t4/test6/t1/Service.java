package com.zichen.t4.test6.t1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 21:21:56
 * @Version: 1.0
 **/
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod() {
        try {
            lock.lock();
            System.out.println("lock begin " + Thread.currentThread().getName());
            int count = 0;
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                count++;
            }
            System.out.println(" 循环了 " + count + " 次。");
            System.out.println("lock  end " + Thread.currentThread().getName());
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}