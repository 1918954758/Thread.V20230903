package com.zichen.t2.twoObjectTwoLock;

/**
 * @Name: HasSelfPrivateNum
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 22:03:27
 * @Version: 1.0
 **/
public class HasSelfPrivateNum {
    private int num = 0;
    synchronized public void addI(String username) {
        try {
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}