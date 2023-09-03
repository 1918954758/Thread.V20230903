package com.zichen.t2.twoStop2;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 22:06:59
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        Object object1 = new Object();
        Object object2 = new Object();
        ThreadA threadA = new ThreadA(service, object1);
        threadA.start();
        ThreadB threadB = new ThreadB(service, object2);
        threadB.start();
    }
}