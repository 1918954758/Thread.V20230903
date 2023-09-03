package com.zichen.t2.syncOneThreadIn;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 11:51:14
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(objectService);
        threadB.setName("B");
        threadB.start();
    }
}