package com.zichen.t3.p_c_allWait;

import com.zichen.t2.synTwoLock.ThreadC;

/**
 * @Name: P
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:37:05
 * @Version: 1.0
 **/
public class P {
    private String lock;
    P (String lock) {
        this.lock = lock;
    }
    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println(" 生产者 " + Thread.currentThread().getName() + " WAITING 了★");
                    lock.wait();
                }
                System.out.println(" 生产者 " + Thread.currentThread().getName() + " RUNNABLE 了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}