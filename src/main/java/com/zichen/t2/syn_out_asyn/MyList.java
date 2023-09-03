package com.zichen.t2.syn_out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Name: MyList
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 16:51:25
 * @Version: 1.0
 **/
public class MyList {
    private List list = new ArrayList();
    synchronized public void add(String username) {
        System.out.println("ThreadName = " + Thread.currentThread().getName() + " 执行了add方法！");
        list.add(username);
        System.out.println("ThreadName = " + Thread.currentThread().getName() + " 退出了add方法！");
    }
}