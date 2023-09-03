package com.zichen.t1.suspend_resume_nosameValue;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 20:46:12
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(() -> myObject.setValue("a", "aa"));
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread(myObject::printUsernamePassword);
        thread2.start();
    }
}