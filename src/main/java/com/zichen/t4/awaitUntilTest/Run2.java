package com.zichen.t4.awaitUntilTest;

/**
 * @Name: Run2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 22:56:38
 * @Version: 1.0
 **/
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(2000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}