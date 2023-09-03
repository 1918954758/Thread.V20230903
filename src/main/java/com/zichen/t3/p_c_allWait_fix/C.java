package com.zichen.t3.p_c_allWait_fix;

/**
 * @Name: C
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:41:57
 * @Version: 1.0
 **/
public class C {
    private String lock;
    C (String lock) {
        this.lock = lock;
    }
    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println(" 消费者 " + Thread.currentThread().getName() + " WAITING 了☆");
                    lock.wait();
                }
                System.out.println(" 消费者 " + Thread.currentThread().getName() + " RUNNABLE 了");
                ValueObject.value = "";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}