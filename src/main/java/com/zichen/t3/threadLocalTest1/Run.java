package com.zichen.t3.threadLocalTest1;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 16:41:59
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(100);
            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}