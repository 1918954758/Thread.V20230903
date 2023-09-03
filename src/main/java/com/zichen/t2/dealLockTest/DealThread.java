package com.zichen.t2.dealLockTest;

/**
 * @Name: DealThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 22:20:19
 * @Version: 1.0
 **/
public class DealThread implements Runnable {
    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();
    public void setFlag(String username) {
        this.username = username;
    }
    @Override
    public void run() {
        if ("a".equals(username)) {
            synchronized(lock1) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(lock2) {
                    System.out.println(" 按 lock1 -> lock2 代码顺序执行了 ");
                }
            }
        }
        if ("b".equals(username)) {
            synchronized(lock2) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(lock1) {
                    System.out.println(" 按 lock2 -> lock1 代码顺序执行了 ");
                }
            }
        }
    }
}