package com.zichen.t3.joinTest2;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 11:28:20
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread threadTest = new MyThread();
        threadTest.start();
        threadTest.join();
        System.out.println(" 我想当 threadTest 对象执行完毕后，我再执行 ");
    }
}