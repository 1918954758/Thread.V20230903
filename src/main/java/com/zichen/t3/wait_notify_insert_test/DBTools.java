package com.zichen.t3.wait_notify_insert_test;

/**
 * @Name: DBTools
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 20:15:44
 * @Version: 1.0
 **/
public class DBTools {
    volatile private boolean prevIsA = false;
    private int count = 1;
    DBTools (int count) {
        this.count = count;
    }
    synchronized public void backupA() {
        try {
            while (prevIsA) {
                wait();
//                this.wait();
            }
            for (int i = 0; i < count; i++) {
                System.out.println(" ★ ★ ★ ★ ★");
            }
            prevIsA = true;
            notifyAll();
//            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void backupB() {
        try {
            while (!prevIsA) {
                wait();
//                this.wait();
            }
            for (int i = 0; i < count; i++) {
                System.out.println(" ☆ ☆ ☆ ☆ ☆");
            }
            prevIsA = false;
            notifyAll();
//            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}