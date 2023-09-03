package com.zichen.t3.joinTest1;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 11:28:20
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
//        Thread.sleep(?);
        System.out.println(" 我想当 threadTest 对象执行完毕后，我再执行 ");
        System.out.println(" 当上面代码中的 sleep() 中的值应该写多少了呢？ ");
        System.out.println(" 答案是：根据不能确定 :) ");
    }
}