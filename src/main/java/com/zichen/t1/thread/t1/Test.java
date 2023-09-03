package com.zichen.t1.thread.t1;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 00:20:27
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("myThread");
        thread.start();
        for (int i = 0; i < 10; ++i) {
            try {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}