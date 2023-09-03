package com.zichen.t2.t7;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 13:35:04
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(task);
        threadB.setName("B");
        threadB.start();
    }
}