package com.zichen.t1.stopThrowLock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 17:42:10
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        SynchronizedObject object = new SynchronizedObject();
        MyThread thread = new MyThread(object);
        thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.stop();
        System.out.println(object.getUsername() + " " + object.getPasswd());
    }
}