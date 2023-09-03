package com.zichen.t1.t18;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 21:36:39
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
//        thread.setPriority(2);
        thread.start();
    }
}