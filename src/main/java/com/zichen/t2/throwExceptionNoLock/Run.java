package com.zichen.t2.throwExceptionNoLock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:48:05
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}