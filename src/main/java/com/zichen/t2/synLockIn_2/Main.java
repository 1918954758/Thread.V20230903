package com.zichen.t2.synLockIn_2;

/**
 * @Name: Main
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:32:51
 * @Version: 1.0
 **/
public class Main {
    public int i = 10;
    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}