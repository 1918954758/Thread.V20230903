package com.zichen.t1.daemon.thread;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/13 20:50:42
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            // 此处是让main线程阻塞5秒
            // 这样守护线程才存活，当然MyThread中的程序才能被打印出来
            Thread.sleep(5000);
            System.out.println(" 我离开thread对象也不再打印了，也就停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}