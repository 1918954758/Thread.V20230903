package com.zichen.t2.synNotExtends;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 20:02:14
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        MyThreadA threadA = new MyThreadA(subRef);
        threadA.setName("A");
        threadA.start();
        MyThreadB threadB = new MyThreadB(subRef);
        threadB.setName("B");
        threadB.start();
    }
}