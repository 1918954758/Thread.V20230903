package com.zichen.t1.thread.z;

import com.zichen.t1.t4.Run;

/**
 * @Name: Test
 * @Description: 验证线程的执行顺序与调用start()方法的顺序无关
 * @User: xdSun
 * @Date: 2023/04/09 00:27:23
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        MyThread t11 = new MyThread(1);
        MyThread t12 = new MyThread(2);
        MyThread t13 = new MyThread(3);
        MyThread t14 = new MyThread(4);
        MyThread t15 = new MyThread(5);
        MyThread t16 = new MyThread(6);
        MyThread t17 = new MyThread(7);
        MyThread t18 = new MyThread(8);
        MyThread t19 = new MyThread(9);
        MyThread t110 = new MyThread(10);
        MyThread t111 = new MyThread(11);
        MyThread t112 = new MyThread(12);
        MyThread t113 = new MyThread(13);
        MyThread t114 = new MyThread(14);
        Run.a(t11, t12, t13, t14, t15, t16, t17, t18, t19, t110);
        t111.start();
        t112.start();
        t113.start();
        t114.start();
    }
}