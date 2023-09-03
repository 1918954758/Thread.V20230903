package com.zichen.t4.awaitUntilTest;

/**
 * @Name: Run1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 22:55:08
 * @Version: 1.0
 **/
public class Run1 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
    }
}