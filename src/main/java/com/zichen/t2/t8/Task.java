package com.zichen.t2.t8;

/**
 * @Name: Task
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 13:57:59
 * @Version: 1.0
 **/
public class Task {
    synchronized public void otherMethod() {
        System.out.println("---------------------------run - otherMethod");
    }
    public void doLongTimeTask() {
        synchronized(this) {
            for (int i = 1; i < 10000; i++) {
                System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i = " + i);
            }
        }
    }
}