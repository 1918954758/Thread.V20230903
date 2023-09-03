package com.zichen.t2.synTwoLock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 19:12:51
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");
        threadC.start();
    }
}