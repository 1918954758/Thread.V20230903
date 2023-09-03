package com.zichen.t3.wait_notify_size5.test1;

/**
 * @Name: T2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:35:55
 * @Version: 1.0
 **/
public class T2 extends Thread {
    private T t;
    private Object lock;
    T2 (T t, Object lock) {
        this.t = t;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                System.out.println(" T2 开始循环。。。");
                if (t.printSize() == 5) {
                    System.out.println(" size = 5，开始调用 notify");
                    lock.notify();
                    System.out.println(" size = 5，结束调用 notify");
                    break;
                }
            }
        }
    }
}