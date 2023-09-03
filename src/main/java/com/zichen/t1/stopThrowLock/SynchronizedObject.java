package com.zichen.t1.stopThrowLock;

/**
 * @Name: SynchronizedObject
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 17:37:53
 * @Version: 1.0
 **/
public class SynchronizedObject {
    private String username = "a";
    private String passwd = "aa";
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    synchronized public void printString(String username, String passwd) {
        try {
            this.username = username;
            Thread.sleep(100000);
            this.passwd = passwd;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}