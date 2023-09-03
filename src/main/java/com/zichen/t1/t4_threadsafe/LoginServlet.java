package com.zichen.t1.t4_threadsafe;

/**
 * @Name: LoginServer
 * @Description: 模拟servlet组件
 *
 * 问题，如果不适用synchronized关键字，会出现，a用户修改的usernamRef被b用户修改
 *      最后打印出来的结果就是b用户aa密码
 *      加上synchronized关键字，就会阻塞，等待a用户结束，b用户再登录
 * @User: xdSun
 * @Date: 2023/04/09 11:45:03
 * @Version: 1.0
 **/
public class LoginServlet {
    private static String usernameRef;
    private static String passwdRef;

    synchronized public static void doPost(String username, String passwd) {
        try {
            usernameRef = username;
            if ("a".equals(username)) {
                Thread.sleep(5000);
            }
            passwdRef = passwd;
            System.out.println("username = " + usernameRef + " passwd = " + passwdRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}