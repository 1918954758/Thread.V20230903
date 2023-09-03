package com.zichen.t1.methods.getid;

/**
 * @Name: Test
 * @Description: getId() 取得线程的唯一标识
 * @User: xdSun
 * @Date: 2023/04/09 14:10:03
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}