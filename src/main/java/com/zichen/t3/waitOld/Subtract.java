package com.zichen.t3.waitOld;

/**
 * @Name: Subtract
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 17:32:18
 * @Version: 1.0
 **/
public class Subtract {
    private String lock;
    Subtract (String lock) {
        this.lock = lock;
    }
    public void subtract() {
        try {
            synchronized (lock) {
//                if (ValueObject.list.size() == 0) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("wait begin ThreadName = " + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end   ThreadName = " + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size = " + ValueObject.list.size() + " " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}