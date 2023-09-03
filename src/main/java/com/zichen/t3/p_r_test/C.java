package com.zichen.t3.p_r_test;

/**
 * @Name: C
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:08:45
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
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get 的值是 " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}