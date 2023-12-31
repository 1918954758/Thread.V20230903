package com.zichen.t3.waitHasParamMethod.t2;

/**
 * @Name: MyRunnable
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 12:41:56
 * @Version: 1.0
 **/
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin time = " + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end   time = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin time = " + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end   time = " + System.currentTimeMillis());
            }
        }
    };
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(runnable1);
        t1.start();
        Thread.sleep(3000);
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}