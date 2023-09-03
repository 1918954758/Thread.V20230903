package com.zichen.t2.innerTest2;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:11:15
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        final OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2();
        Thread t1 = new Thread(() -> innerClass1.method1(innerClass2), "T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method2();
            }
        }, "T2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method1();
            }
        }, "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}