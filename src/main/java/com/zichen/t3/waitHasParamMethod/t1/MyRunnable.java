package com.zichen.t3.waitHasParamMethod.t1;

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
    public static void main(String[] args) {
        Thread t = new Thread(runnable1);
        t.start();
    }
}