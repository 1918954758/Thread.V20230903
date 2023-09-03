package com.zichen.t1.t4;

/**
 * @Name: Test
 * @Description: 多个线程共享数据测试
 * 问题，多个线程共享数据存在线程安全问题
 * 也就是，一个线程修改了数据，另一个线程在不知情的情况下也修改了数据
 * 解决多线程安全问题，可以使用关键字 synchronized
 * @User: xdSun
 * @Date: 2023/04/09 00:55:14
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread);
        Thread b = new Thread(myThread);
        Thread c = new Thread(myThread);
        Thread d = new Thread(myThread);
        Thread e = new Thread(myThread);
        Thread f = new Thread(myThread);
        Thread g = new Thread(myThread);
        Thread h = new Thread(myThread);
        Thread i = new Thread(myThread);
        Thread j = new Thread(myThread);
        a(a, b, c, d, e, f, g, h, i, j);
    }

    public static void a(Thread a, Thread b, Thread c, Thread d, Thread e, Thread f, Thread g, Thread h, Thread i, Thread j) {
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();
        h.start();
        i.start();
        j.start();
    }
}