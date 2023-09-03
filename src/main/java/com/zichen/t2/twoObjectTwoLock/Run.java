package com.zichen.t2.twoObjectTwoLock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 22:11:56
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRefA = new HasSelfPrivateNum();
        new ThreadA(numRefA).start();
        HasSelfPrivateNum numRefB = new HasSelfPrivateNum();
        new ThreadB(numRefB).start();
    }
}