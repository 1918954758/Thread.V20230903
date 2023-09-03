package com.zichen.t2.synBlockMoreObjectOneLock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 19:12:51
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        threadB.start();
    }
}