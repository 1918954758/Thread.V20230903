package com.zichen.t2.twoStop2.atomicIntegerTest;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 12:49:40
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        AddCountThread addCountThread = new AddCountThread();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
        new Thread(addCountThread).start();
    }
}