package com.zichen.t2.t1;

/**
 * @Name: HasSelfPrivateNum
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 21:26:55
 * @Version: 1.0
 **/
public class HasSelfPrivateNum {
//    private int num = 0;
    public void addI(String username) {
        try {
            int num;
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