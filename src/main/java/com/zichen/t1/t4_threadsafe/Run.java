package com.zichen.t1.t4_threadsafe;

/**
 * @Name: Test
 * @Description: 模拟服务运行
 * @User: xdSun
 * @Date: 2023/04/09 11:50:57
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        aLogin.start();
        bLogin.start();
    }
}