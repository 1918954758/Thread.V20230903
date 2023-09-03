package com.zichen.t2.syncMethodLockObject;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 22:36:05
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyObject object= new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");
        threadB.start();
    }
}