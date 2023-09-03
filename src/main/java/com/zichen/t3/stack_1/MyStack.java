package com.zichen.t3.stack_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Name: MyStack
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 13:41:42
 * @Version: 1.0
 **/
public class MyStack {
    private List<String> list = new ArrayList();
    synchronized public void push() {
        try {
            if (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notify();
            System.out.println("push = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public String pop() {
        String returnValue = "";
        try {
            if (list.size() == 0) {
                System.out.println("pop 操作中的： " + Thread.currentThread().getName() + " 线程呈 wait 状态");
                this.wait();
            }
            returnValue = list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}