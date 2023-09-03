package com.zichen.t2.setNewPropertiesLockOne;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:55:28
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            UserInfo userInfo = new UserInfo();
            ThreadA a = new ThreadA(service, userInfo);
            a.setName("A");
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(service, userInfo);
            b.setName("B");
            b.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}