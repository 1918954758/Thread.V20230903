package com.zichen.t1.methods.isalive.t7;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 13:53:33
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin == " + myThread.isAlive());
        myThread.start();
        System.out.println("end == " + myThread.isAlive());
    }
}