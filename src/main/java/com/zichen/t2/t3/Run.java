package com.zichen.t2.t3;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/14 23:40:30
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA thread = new ThreadA(publicVar);
            thread.start();
            Thread.sleep(4000);// 打印内容和此处设置的时间有关
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}