package com.zichen.t4.readWriteLockBegin3;

/**
 * @Name: Run
 * @Description: 读写互斥
 * @User: xdSun
 * @Date: 2023/05/19 09:34:08
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}