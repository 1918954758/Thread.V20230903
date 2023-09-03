package com.zichen.t1.t4_threadsafe;

/**
 * @Name: ALogin
 * @Description: 模拟A登录
 * @User: xdSun
 * @Date: 2023/04/09 11:48:42
 * @Version: 1.0
 **/
public class ALogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}