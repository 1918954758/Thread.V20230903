package com.zichen.t3.advanceNotify;

/**
 * @Name: MyRun
 * @Description: 提前通知，导致程序不能按照正确的逻辑进行
 * @User: xdSun
 * @Date: 2023/04/29 16:35:24
 * @Version: 1.0
 **/
public class MyRun2 {
    private String lock = new String("");
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("begin wait()");
                    lock.wait();
                    System.out.println("end   wait()");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify()");
                lock.notify();
                System.out.println("end   notify()");
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun2 run = new MyRun2();
        Thread a = new Thread(run.runnableA);
        a.setName("A");
        a.start();
        Thread.sleep(100);
        Thread b = new Thread(run.runnableB);
        b.setName("B");
        b.start();
    }
}