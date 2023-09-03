package com.zichen.t3.join_sleep_2;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 12:59:35
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private ThreadB b;
    ThreadA (ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
//                Thread.sleep(6000);
//                Thread.sleep();//不释放锁
//                this.join(6000); // 这个this 是当前线程
                b.join(6000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}