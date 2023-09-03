package com.zichen.t1.t3;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 00:44:45
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    private int count = 5;
    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(" 由 " + this.getName() + " 计算，count = " + count);
        }
    }
}