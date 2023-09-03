package com.zichen.t2.setNewPropertiesLockOne;

/**
 * @Name: UserInfo
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:49:27
 * @Version: 1.0
 **/
public class Service {
    public void serviceMethodA(UserInfo userInfo) {
        synchronized(userInfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUserName("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end time = " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}