package com.zichen.t2.t1;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 21:32:51
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        new ThreadA(numRef).start();
        new ThreadB(numRef).start();
    }
}