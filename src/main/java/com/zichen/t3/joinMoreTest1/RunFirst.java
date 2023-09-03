package com.zichen.t3.joinMoreTest1;

/**
 * @Name: RunFirst
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 15:00:01
 * @Version: 1.0
 **/
public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("   main end = " + System.currentTimeMillis());
    }
}