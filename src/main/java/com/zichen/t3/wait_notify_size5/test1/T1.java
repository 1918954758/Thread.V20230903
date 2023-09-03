package com.zichen.t3.wait_notify_size5.test1;

/**
 * @Name: T1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:30:14
 * @Version: 1.0
 **/
public class T1 extends Thread {
    private T t;
    private Object lock;
    T1(T t, Object lock) {
        this.t = t;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                t.setT();
                if (t.printSize() == 5) {
                    try {
                        System.out.println(" T1 在wait执行前打印");
                        lock.wait();
                        System.out.println(" T1 在wait执行后打印");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(" T1结束循环");
                    break;
                }
            }
        }
    }
}