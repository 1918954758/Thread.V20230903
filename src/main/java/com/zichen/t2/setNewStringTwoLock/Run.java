package com.zichen.t2.setNewStringTwoLock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:25:18
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA tA = new ThreadA(service);
        tA.setName("A");
        ThreadB tB = new ThreadB(service);
        tB.setName("B");
        tA.start();
//        ThreadA.sleep(50);
        tB.start();
    }
}