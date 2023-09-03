package com.zichen.t1.t14_1;

/**
 * @Name: Test
 * @Description: 在沉睡中停止线程
 * @User: xdSun
 * @Date: 2023/04/09 16:52:20
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println(" end!");
    }
}
/*
 end!
 for ...
 run begin
 在沉睡中被停止！进入catch！
 */