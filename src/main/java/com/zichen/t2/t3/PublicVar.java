package com.zichen.t2.t3;

/**
 * @Name: PublicVar
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 23:35:43
 * @Version: 1.0
 **/
public class PublicVar {
    private String username = "A";
    private String password = "AA";
    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username  = " + username + " password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void getValue() {
        System.out.println("getValue method name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
    }
}