package com.zichen.t2.t7;

/**
 * @Name: Task
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 13:31:26
 * @Version: 1.0
 **/
public class Task {
    private boolean flag = true;
    public void doLongTimeTask() {
        synchronized (this) {
            if (flag) {
                System.out.println("no-synchronized exec");
                flag = false;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("no-synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        synchronized (this) {
            if (flag) {
                System.out.println("synchronized exec");
                flag = false;
            }
        }
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                System.out.println("no-synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }
}