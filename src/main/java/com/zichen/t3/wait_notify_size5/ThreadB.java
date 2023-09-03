package com.zichen.t3.wait_notify_size5;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:49:16
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private Object lock;
    ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println(" 已发出通知！");
                    }
                    System.out.println(" 添加了 " + (i + 1) + " 个元素！");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}