package com.zichen.t2.setNewPropertiesLockOne;

import com.zichen.t2.setNewStringTwoLock.MyService;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 16:24:07
 * @Version: 1.0
 **/
public class ThreadA extends Thread{
    private Service service;
    private UserInfo userInfo;
    ThreadA(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}