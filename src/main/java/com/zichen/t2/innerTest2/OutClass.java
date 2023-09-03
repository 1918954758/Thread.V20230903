package com.zichen.t2.innerTest2;

/**
 * @Name: OutClass
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 15:57:18
 * @Version: 1.0
 **/
public class OutClass {
    static class InnerClass1 {
        public void method1(InnerClass2 class2) {
            String threadName = Thread.currentThread().getName();
            synchronized(class2) {
                System.out.println(threadName + " 进入 InnerClass1 类中的method1 方法");
                for (int i = 0; i < 10; ++i) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(threadName + " 离开 InnerClass1 类中的 method1 方法");
            }
        }
        public synchronized void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入 InnerClass1 类中的 method2 方法");
            for (int j = 0; j < 10; ++j) {
                System.out.println("j = " + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(threadName + " 离开 InnerClass1 类中的 method2 方法");
        }
    }
    static class InnerClass2 {
        public synchronized void method1() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入 InnerClass2 类中的 method1 方法");
            for (int k = 0; k < 10; ++k) {
                System.out.println("k = " + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(threadName + " 离开 InnerClass2 类中的 method1 方法");
        }
    }
}