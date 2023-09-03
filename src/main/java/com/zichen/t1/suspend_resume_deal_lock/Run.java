package com.zichen.t1.suspend_resume_deal_lock;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 20:20:08
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(object::printString);
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(() -> {
                System.out.println("thread2启动了，但进不了printString()方法！");
                System.out.println(" 因为printString()方法被a线程锁定并永远suspend暂停了！");
                object.printString();
            });
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}