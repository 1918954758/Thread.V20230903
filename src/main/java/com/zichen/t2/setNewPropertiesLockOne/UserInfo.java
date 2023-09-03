package com.zichen.t2.setNewPropertiesLockOne;

/**
 * @Name: UserInfo
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:52:38
 * @Version: 1.0
 **/
public class UserInfo {
    private String userName;
    private String passWord;
    UserInfo() {

    }
    UserInfo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}