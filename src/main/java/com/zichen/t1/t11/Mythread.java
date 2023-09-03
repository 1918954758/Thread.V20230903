package com.zichen.t1.t11;

/**
 * @Name: Mythread
 * @Description: 测试 interrupt()
 * @User: xdSun
 * @Date: 2023/04/09 14:35:36
 * @Version: 1.0
 **/
public class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 500000; ++i) {
            System.out.println("i = " + (i + 1));
        }
    }
}