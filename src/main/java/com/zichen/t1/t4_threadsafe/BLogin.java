package com.zichen.t1.t4_threadsafe;

/**
 * @Name: BLogin
 * @Description: 模拟B登录
 * @User: xdSun
 * @Date: 2023/04/09 11:50:16
 * @Version: 1.0
 **/
public class BLogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}