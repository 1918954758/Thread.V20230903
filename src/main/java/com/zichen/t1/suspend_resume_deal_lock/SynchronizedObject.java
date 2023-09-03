package com.zichen.t1.suspend_resume_deal_lock;

/**
 * @Name: SynchronizedObject
 * @Description: suspend独占锁，别的线程进不来
 * @User: xdSun
 * @Date: 2023/04/09 20:18:42
 * @Version: 1.0
 **/
public class SynchronizedObject {
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a 线程永远 suspend 了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}