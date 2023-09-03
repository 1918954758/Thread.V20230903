package com.zichen.t3.inheritableThreadLocal1;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 17:11:43
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("    在 Main 线程中取值 = " + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(1000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}