package com.zichen.t1.t3;

/**
 * @Name: Test
 * @Description: 不共享数据运行结果测试
 * @User: xdSun
 * @Date: 2023/04/09 00:47:48
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("A");
        MyThread myThread2 = new MyThread("B");
        MyThread myThread3 = new MyThread("C");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}