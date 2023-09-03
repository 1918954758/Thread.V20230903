package com.zichen.t3.p_r_test;

/**
 * @Name: P
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:05:07
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
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set 的值是 " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}