package com.zichen.t1.suspend_resume_nosameValue;

/**
 * @Name: MyObject
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 20:43:13
 * @Version: 1.0
 **/
public class MyObject {
    private String username = "1";
    private String password = "11";
    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println(" 停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }
    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}